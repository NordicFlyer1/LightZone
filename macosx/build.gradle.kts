dependencies {
    "implementation"(project(":lightcrafts"))
}
application {
    mainClass.set("com.lightcrafts.platform.macosx.MacOSXLauncher")
    tasks.run.get().workingDir = file("products")
}
