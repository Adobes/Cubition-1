package net.cubition.bootstrap;

import java.io.Serializable;

/**
 * A resource is a mod, library, executable, texture pack, or other content that can be pulled at runtime.
 *
 * This is completely serializable, and can be thrown around. This is also compatible with GSON.
 *
 * {@link com.google.gson.Gson}
 */
public class Resource implements Serializable {
    /**
     * The name of the resource defines the actual resource name, and is used in downloading resources.
     */
    private final String name;

    /**
     * The author is the one who created the resource, and therefore defines what namespace this resource is under.
     */
    private final String author;

    /**
     * The version of the resource. 'LATEST' means that the newest resource is used.
     */
    private final String version;

    /**
     * Creates a new Resource representation containing data useful for fetching the mod, as well as version control.
     *
     * @param name The name of this resource
     * @param author The author of this resource
     * @param version The version of this resource
     */
    public Resource(String name, String author, String version) {
        this.name = name;
        this.author = author;
        this.version = version;
    }

    /**
     * Returns the name of this resource. This is also the name used in polling for resources.
     *
     * @return The name of this resource.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the author of this resource. This also defines what namespace this resource is under.
     *
     * @return The author of this resource.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Poll dependencies for this Resource.
     *
     * @return The dependencies for this Resource, if any.
     */
    public Resource[] pollDependencies() {
        // TODO: This is a placeholder. Poll dependencies here.
        return new Resource[0];
    }
}
