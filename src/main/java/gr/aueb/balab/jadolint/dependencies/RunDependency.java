package gr.aueb.balab.jadolint.dependencies;

public class RunDependency extends Dependency {

    private String packageName, packageVersion;

    public RunDependency(String packageName, String packageVersion) {
        super(packageName, packageVersion);
    }
}
