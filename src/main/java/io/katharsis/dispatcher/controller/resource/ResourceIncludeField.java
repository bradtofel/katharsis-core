package io.katharsis.dispatcher.controller.resource;

import io.katharsis.dispatcher.controller.BaseController;
import io.katharsis.queryParams.QueryParamsBuilder;
import io.katharsis.resource.include.IncludeLookupSetter;
import io.katharsis.resource.registry.ResourceRegistry;
import io.katharsis.utils.parser.TypeParser;

public abstract class ResourceIncludeField extends BaseController {

    protected final ResourceRegistry resourceRegistry;
    protected final TypeParser typeParser;
    protected final IncludeLookupSetter includeFieldSetter;
    private QueryParamsBuilder queryParamsBuilder;

    public ResourceIncludeField(ResourceRegistry resourceRegistry,
                                TypeParser typeParser,
                                IncludeLookupSetter fieldSetter,
                                QueryParamsBuilder queryParamsBuilder) {
        this.resourceRegistry = resourceRegistry;
        this.typeParser = typeParser;
        this.includeFieldSetter = fieldSetter;
        this.queryParamsBuilder = queryParamsBuilder;
    }

    @Override
    public TypeParser getTypeParser() {
        return typeParser;
    }

    @Override
    public QueryParamsBuilder getQueryParamsBuilder() {
        return queryParamsBuilder;
    }

}
