package powerdancer.git.versioned.jars.plugin

import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.UnknownTaskException

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class Plugin implements org.gradle.api.Plugin<Project> {
    void apply(Project p) {
        try {
            Files.createDirectories(Paths.get(p.projectDir.path, "src/main/resources"))
            Files.write(Paths.get(p.projectDir.path, "src/main/resources/version"), 'git log -1 --pretty=format:%H'.execute().text.trim().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
        }
        catch (UnknownTaskException e) {
        }
        p.subprojects(new Action<Project>() {
            @Override
            void execute(Project project) {
                apply(project)
            }
        })
    }
}
