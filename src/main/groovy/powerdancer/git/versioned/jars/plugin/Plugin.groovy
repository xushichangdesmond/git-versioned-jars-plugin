package powerdancer.git.versioned.jars.plugin

import org.gradle.api.Project

class Plugin implements org.gradle.api.Plugin<Project> {
    void apply(Project p) {
        p.task('build') {
            doFirst {
                
            }
        }
    }

    def gitCommit() {
        return 'git log -1 --pretty=format:%H'.execute().text.trim()
    }
}
