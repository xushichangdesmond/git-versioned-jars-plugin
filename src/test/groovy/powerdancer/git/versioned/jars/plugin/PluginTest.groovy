package powerdancer.git.versioned.jars.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test

class PluginTest {

    @Test
    void myTest() {
        Project project = ProjectBuilder.builder().withProjectDir(new File("testProj")).build()
        project.pluginManager.apply 'powerdancer.git.versioned.jars.plugin'
        project.tasks.build.execute()
    }
}
