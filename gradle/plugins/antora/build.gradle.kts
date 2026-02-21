import junitbuild.extensions.markerCoordinates

plugins {
	`kotlin-dsl`
}

dependencies {
	implementation(projects.buildParameters)
	implementation(libs.plugins.node.markerCoordinates)
	constraints {
		implementation("com.fasterxml.jackson.core:jackson-core") {
			version {
				require("2.15.0")
			}
			because("Workaround for CVE-2025-52999")
		}
	}
	implementation(libs.plugins.spring.antora.markerCoordinates)
	constraints {
		implementation("org.yaml:snakeyaml") {
			version {
				require("2.0")
			}
			because("Workaround for CVE-2022-1471")
		}
	}
}
