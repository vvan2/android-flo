pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // 프로젝트 리포지토리 금지
    repositories {
        google() // Google Maven Repository
        mavenCentral() // Maven Central Repository
        maven { url = uri("https://jitpack.io") } // JitPack (필요 시 추가)
        maven { url = uri("https://devrepo.kakao.com/nexus/content/groups/public/") } // Kakao SDK
    }
}

rootProject.name = "real.flocoding"
include(":app")
 