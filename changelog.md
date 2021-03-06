# katharsis-core v2.4.0 git changelog

2016-05-10    v2.4.0 (Patryk Orwat)  

**v2.4.0**  
2016-05-04    [#305](https://github.com/katharsis-project/katharsis-core/issues/305) checking for duplicate inclusion entries ([#306](https://github.com/katharsis-project/katharsis-core/issues/306)) (Patryk Orwat)  
2016-04-21    [#297](https://github.com/katharsis-project/katharsis-core/issues/297) corrected relationship type returned with inheritance ([#302](https://github.com/katharsis-project/katharsis-core/issues/302)) (Patryk Orwat)  
2016-04-21    [#294](https://github.com/katharsis-project/katharsis-core/issues/294) toString for QueryParams (Patryk Orwat)  
2016-04-21    [#288](https://github.com/katharsis-project/katharsis-core/issues/288) Allowed repositories to fill in top level JSON meta and links information  (Patryk Orwat)  
2016-04-21    [#277](https://github.com/katharsis-project/katharsis-core/issues/277) final query params regex definition (Patryk Orwat)  
2016-04-15    [#250](https://github.com/katharsis-project/katharsis-core/issues/250) allowed using Jackson 2.5 (Patryk Orwat)  
2016-04-14    [#290](https://github.com/katharsis-project/katharsis-core/issues/290) getting a repository instance at request time (Patryk Orwat)  
2016-04-14    [#264](https://github.com/katharsis-project/katharsis-core/issues/264) [#289](https://github.com/katharsis-project/katharsis-core/issues/289) exceptions handling refactoring (Patryk Orwat)  

**v2.3.2**  
2016-04-10    v2.3.2 (Patryk Orwat)  
2016-04-09    [#262](https://github.com/katharsis-project/katharsis-core/issues/262) fixed tests (Patryk Orwat)  
2016-04-09    [#262](https://github.com/katharsis-project/katharsis-core/issues/262) meta and links aren't basic fields (Patryk Orwat)  
2016-04-08    Update katharsis version in README.md (David Martin)  
2016-04-06    [#280](https://github.com/katharsis-project/katharsis-core/issues/280) allow Katharsis to use Jackson 2.7+ (Patryk Orwat)  
2016-04-06    [#267](https://github.com/katharsis-project/katharsis-core/issues/267) code refactoring for resource serialization (Patryk Orwat)  
2016-04-04    [#267](https://github.com/katharsis-project/katharsis-core/issues/267) compiling code (Patryk Orwat)  
2016-04-01    [#274](https://github.com/katharsis-project/katharsis-core/issues/274) additional characters for query params (Patryk Orwat)  
2016-03-31    Fixes more cases for [#225](https://github.com/katharsis-project/katharsis-core/issues/225) (Ioan Eugen Stan)  
2016-03-30    [#267](https://github.com/katharsis-project/katharsis-core/issues/267) dynamic attributes WIP (Patryk Orwat)  
2016-03-24    [#271](https://github.com/katharsis-project/katharsis-core/issues/271) added tests for lookup override (Patryk Orwat)  
2016-03-23    add option to overwrite an included value with the value of the relationship repository (Cade Parker)  
2016-03-22    [#243](https://github.com/katharsis-project/katharsis-core/issues/243) javadoc for JsonApiLookupIncludeAutomatically (Patryk Orwat)  
2016-03-22    [#263](https://github.com/katharsis-project/katharsis-core/issues/263) Non-annotated nested resource ID and relationships are now returned (Patryk Orwat)  
2016-03-21    [#262](https://github.com/katharsis-project/katharsis-core/issues/262) added meta and links information per resource (Patryk Orwat)  
2016-03-13    v2.3.1 (Patryk Orwat)  
2016-03-09    Fixes [#258](https://github.com/katharsis-project/katharsis-core/issues/258) (NPE when looking for a target class on @JsonApiRelationshipRepository) (Sergey Zubtsovskiy)  
2016-03-08    multiple code improvements: squid:S00105, squid:S1226, squid:S1193, squid:S1700 (George Kankava)  
2016-03-08    multiple code improvements: squid:S1068, squid:S2864, squid:S2325, squid:S1226, squid:S00105 (George Kankava)  
2016-03-07    [#220](https://github.com/katharsis-project/katharsis-core/issues/220) inclusion enhancements (Patryk Orwat)  
2016-03-07    [#246](https://github.com/katharsis-project/katharsis-core/issues/246) added test for bug reproduction (Patryk Orwat)  
2016-03-07    multiple code improvements: squid:S00105, squid:S1068, squid:S1155 (George Kankava)  
2016-03-07    multiple code improvements: squid:S2325, squid:S1596, squid:UselessParenthesesCheck (George Kankava)  
2016-02-26    Remove object mapper clean up, because it's configured again in next usage.  katharsis-project/katharsis-core[#246](https://github.com/katharsis-project/katharsis-core/issues/246) (Tiago Daniel Jacobs)  
2016-02-26    Clean up of attributes serializer code that fix katharsis-project/katharsis-core[#246](https://github.com/katharsis-project/katharsis-core/issues/246) (Tiago Daniel Jacobs)  
2016-02-26    Changed the attributes serializer to only filter attributes of the root element in order to fix katharsis-project/katharsis-core[#246](https://github.com/katharsis-project/katharsis-core/issues/246) (Tiago Daniel Jacobs)  
2016-02-22    [#242](https://github.com/katharsis-project/katharsis-core/issues/242) allowed multiple inclusions (Patryk Orwat)  

**v2.3.0**  
2016-02-21    v2.3.0 (Patryk Orwat)  
2016-02-21    refactoring to [#241](https://github.com/katharsis-project/katharsis-core/issues/241) (Patryk Orwat)  
2016-02-21    Improvements in attributes serializer katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-20    Fix for JsonIgnore annotation. katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-20    Code cleanup. katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-20    Implement filter to avoid infinite recursion in circular referenced objects. katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-19    Keep the behavior of not serialize null values. katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-19    Change the attributes serialization to support annotations. katharsis-project/katharsis-core[#240](https://github.com/katharsis-project/katharsis-core/issues/240) and katharsis-project/katharsis-core[#233](https://github.com/katharsis-project/katharsis-core/issues/233) (Tiago Daniel Jacobs)  
2016-02-16    [#229](https://github.com/katharsis-project/katharsis-core/issues/229) NPE, javadoc (Patryk Orwat)  
2016-02-13    [#234](https://github.com/katharsis-project/katharsis-core/issues/234) disallow writing null resource attributes (Patryk Orwat)  
2016-02-13    [#212](https://github.com/katharsis-project/katharsis-core/issues/212) added logging of resources and repositories (Patryk Orwat)  
2016-02-12    [#215](https://github.com/katharsis-project/katharsis-core/issues/215) added a new exception for property accessing (Patryk Orwat)  
2016-02-12    [#226](https://github.com/katharsis-project/katharsis-core/issues/226) throwing matching exception when found non-existing inclusion (Patryk Orwat)  
2016-02-11    [#225](https://github.com/katharsis-project/katharsis-core/issues/225) fixed tests (Patryk Orwat)  
2016-02-11    [#225](https://github.com/katharsis-project/katharsis-core/issues/225) fixed field's name introspection when upserting to-many relationships, added tests (Patryk Orwat)  
2016-02-11    Fixes [#225](https://github.com/katharsis-project/katharsis-core/issues/225) patch for resource (Ioan Eugen Stan)  
2016-02-10    squid:S2325 "private" methods that don't access instance data should be "static" (George Kankava)  
2016-02-09    222: Break in ResourceRegistry (Charlie Helin)  
2016-02-06    squid:S00122 Statements should be on separate lines (George Kankava)  
2016-02-04    squid:S2325  "private" methods that don't access instance data should be "static" (George Kankava)  
2016-02-03    v2.2.0 (Patryk Orwat)  

**v2.2.0**  
2016-02-03    removed Java 8 API comment link (Razvan Dragut)  
2016-02-03    Fixed spring boot example (Razvan Dragut)  
2016-02-03    Enhancement [#209](https://github.com/katharsis-project/katharsis-core/issues/209) - Provide custom QueryParamsBuilder (Razvan Dragut)  

**v2.1.7**  
2016-01-27    v2.1.7 (Patryk Orwat)  

**v2.1.5**  
2016-01-26    v2.1.5 (Patryk Orwat)  
2016-01-26    v2.1.4 (Patryk Orwat)  
2016-01-07    Added null check in BaseController when verifying type (Staffan Friberg)  
2015-12-27    [#199](https://github.com/katharsis-project/katharsis-core/issues/199) added JsonPropertyOrder support (Patryk Orwat)  
2015-12-27    [#107](https://github.com/katharsis-project/katharsis-core/issues/107) added naming strategy (Patryk Orwat)  
2015-12-26    [#107](https://github.com/katharsis-project/katharsis-core/issues/107) code refactoring (Patryk Orwat)  
2015-12-22    include 'number' and 'size' in RestrictedPaginationKeys (Cade Parker)  

**v2.1.3**  
2015-12-21    v2.1.3 (Patryk Orwat)  
2015-12-20    [#48](https://github.com/katharsis-project/katharsis-core/issues/48) travis update (Patryk Orwat)  
2015-12-20    [#48](https://github.com/katharsis-project/katharsis-core/issues/48) corporate dictatorship - finished tests (Patryk Orwat)  
2015-12-20    [#48](https://github.com/katharsis-project/katharsis-core/issues/48) corporate dictatorship - finished main classes (Patryk Orwat)  
2015-12-20    [#48](https://github.com/katharsis-project/katharsis-core/issues/48) first set of changed classes from main (Patryk Orwat)  
2015-12-12    [#193](https://github.com/katharsis-project/katharsis-core/issues/193) fixed NPE when no inclusion definition for request resource passed (meshuga)  
2015-12-09    [#188](https://github.com/katharsis-project/katharsis-core/issues/188) small fix (Patryk Orwat)  

**v2.1.2**  
2015-12-09    v2.1.2 (Patryk Orwat)  
2015-12-08    [#188](https://github.com/katharsis-project/katharsis-core/issues/188) include and fields fix (Patryk Orwat)  
2015-12-08    [#189](https://github.com/katharsis-project/katharsis-core/issues/189) - POST shouldn't call repository findOne method (Błażej Krysiak)  
2015-12-08    [#186](https://github.com/katharsis-project/katharsis-core/issues/186) made reflections optional (Patryk Orwat)  
2015-12-05    [#186](https://github.com/katharsis-project/katharsis-core/issues/186) added OSGi definition (Patryk Orwat)  
2015-12-05    versioneye update (Patryk Orwat)  
2015-12-04    version up (Patryk Orwat)  

**v2.1.1**  
2015-12-03    v2.1.1 (Patryk Orwat)  
2015-12-03    [#184](https://github.com/katharsis-project/katharsis-core/issues/184) fixed @JsonProperty handling (Patryk Orwat)  
2015-12-02    [#179](https://github.com/katharsis-project/katharsis-core/issues/179) fixed resource type with dash problem (Patryk Orwat)  

**v2.1.0**  
2015-12-02    v2.1.0 (Patryk Orwat)  
2015-12-02    [#101](https://github.com/katharsis-project/katharsis-core/issues/101) review (Patryk Orwat)  
2015-12-02    Support for custom handlers for getting exception mappers, resources and resource repositories and relationship repositories See katharsis-project/katharsis-core issue [#101](https://github.com/katharsis-project/katharsis-core/issues/101) (Cornelis Hoeflake)  
2015-12-01    Created interface to collect exception mappers in stead of scanning the classpath (Cornelis Hoeflake)  
2015-11-29    [#168](https://github.com/katharsis-project/katharsis-core/issues/168) code tests + refactor (Patryk Orwat)  
2015-11-28    [#168](https://github.com/katharsis-project/katharsis-core/issues/168) added resource+relationship addition and removal (Patryk Orwat)  
2015-11-27    [#168](https://github.com/katharsis-project/katharsis-core/issues/168) initial implementation/code refactoring (Patryk Orwat)  
2015-11-26    ensure resource registry uses proper class during lookup for resource subclasses (Pascal Brogle)  
2015-11-24    [#172](https://github.com/katharsis-project/katharsis-core/issues/172) added changelog (Patryk Orwat)  
2015-11-23    [#169](https://github.com/katharsis-project/katharsis-core/issues/169) javadoc  fix (Patryk Orwat)  
2015-11-20    [#169](https://github.com/katharsis-project/katharsis-core/issues/169) javadoc (Patryk Orwat)  

**v2.0.1**  
2015-11-19    v2.0.1+javadoc (Patryk Orwat)  
2015-11-19    v2.0.1 (Patryk Orwat)  
2015-11-18    [#164](https://github.com/katharsis-project/katharsis-core/issues/164) allowed for relationships of type Set (Patryk Orwat)  
2015-11-18    Minor improvements (Błażej Krysiak)  
2015-11-18    [#163](https://github.com/katharsis-project/katharsis-core/issues/163) transient and static fields/getters handling (Patryk Orwat)  
2015-11-16    closes [#161](https://github.com/katharsis-project/katharsis-core/issues/161) javadoc fix (Patryk Orwat)  

**v2.0.0**  
2015-11-15    v2.0.0 (Patryk Orwat)  
2015-11-15    [#159](https://github.com/katharsis-project/katharsis-core/issues/159) allow field post to to-many (Patryk Orwat)  
2015-11-13    [#157](https://github.com/katharsis-project/katharsis-core/issues/157) fixed test for posting resource with id (Patryk Orwat)  
2015-11-13    [#157](https://github.com/katharsis-project/katharsis-core/issues/157) RepositoryMethodParameterProvider refactored (Patryk Orwat)  
2015-11-10    [#91](https://github.com/katharsis-project/katharsis-core/issues/91) revert of changes from [#121](https://github.com/katharsis-project/katharsis-core/issues/121) (Patryk Orwat)  
2015-11-05    katharsis-core-80 Support for client generated ids (Błażej Krysiak)  
2015-11-05    Update .travis.yml (Patryk Orwat)  
2015-11-02    [#140](https://github.com/katharsis-project/katharsis-core/issues/140) removed nested inclusions (Patryk Orwat)  
2015-11-02    [#146](https://github.com/katharsis-project/katharsis-core/issues/146) field and getter annotations are now merged together (Patryk Orwat)  
2015-11-01    javadoc (Patryk Orwat)  
2015-11-01    [#144](https://github.com/katharsis-project/katharsis-core/issues/144) added annotations for links and meta information (Patryk Orwat)  
2015-11-01    pom update (Patryk Orwat)  
2015-11-01    small query params fix (Patryk Orwat)  
2015-11-01    javadoc (Patryk Orwat)  
2015-10-31    [#142](https://github.com/katharsis-project/katharsis-core/issues/142) fixed dispatching bug (Patryk Orwat)  
2015-10-30    katharsis-core-114 ([#114](https://github.com/katharsis-project/katharsis-core/issues/114)) Typos (Błażej Krysiak)  
2015-10-30    katharsis-core-114 ([#114](https://github.com/katharsis-project/katharsis-core/issues/114)) Fixing tests (Błażej Krysiak)  
2015-10-29    katharsis-core-114 ([#114](https://github.com/katharsis-project/katharsis-core/issues/114)) Query params deserialization (Błażej Krysiak)  
2015-10-29    [#135](https://github.com/katharsis-project/katharsis-core/issues/135) restored findAll with ids (Patryk Orwat)  
2015-10-29    [#126](https://github.com/katharsis-project/katharsis-core/issues/126) fixed http return codes (Patryk Orwat)  
2015-10-28    katharsis-core-114 Query params deserialization (Błażej Krysiak)  
2015-10-26    fix [#132](https://github.com/katharsis-project/katharsis-core/issues/132) and related problem in container serializer (Pascal Brogle)  
2015-10-25    javadocs, tests fixes (Patryk Orwat)  
2015-10-25    [#128](https://github.com/katharsis-project/katharsis-core/issues/128) boolean property name fix (Patryk Orwat)  
2015-10-25    [#115](https://github.com/katharsis-project/katharsis-core/issues/115) repo auto-discovery fixes (Patryk Orwat)  
2015-10-24    [#115](https://github.com/katharsis-project/katharsis-core/issues/115) added annotated repo auto-discovery (Patryk Orwat)  
2015-10-23    Fixes for merge changes (Zachary Taylor)  
2015-10-22    katharsis-core-114 Query params deserialization (Błażej Krysiak)  
2015-10-22    [#113](https://github.com/katharsis-project/katharsis-core/issues/113) added tests, small fixes (Patryk Orwat)  
2015-10-21    [#120](https://github.com/katharsis-project/katharsis-core/issues/120) fixed relationship post/patch (Patryk Orwat)  
2015-10-20    [#119](https://github.com/katharsis-project/katharsis-core/issues/119) fixed relationship serialization (Patryk Orwat)  
2015-10-19    Rebased from development and fixed changes (Zachary Taylor)  
2015-10-19    Moved implementation to annotation; added tests (Zachary Taylor)  
2015-10-19    Fix data attribute when fields are included (Zachary Taylor)  
2015-10-19    Automatic inclusion, Works but without tests (Zachary Taylor)  
2015-10-18    [#113](https://github.com/katharsis-project/katharsis-core/issues/113) added implementation (Patryk Orwat)  
2015-10-18    [#113](https://github.com/katharsis-project/katharsis-core/issues/113) work in progress (Patryk Orwat)  
2015-10-18    [#113](https://github.com/katharsis-project/katharsis-core/issues/113) added annotations for RelationshipRepository + javadocs (Patryk Orwat)  
2015-10-18    [#103](https://github.com/katharsis-project/katharsis-core/issues/103) annotations rename (Patryk Orwat)  
2015-10-16    version up (Patryk Orwat)  
2015-10-15    [#103](https://github.com/katharsis-project/katharsis-core/issues/103) tests work (Patryk Orwat)  
2015-10-15    [#111](https://github.com/katharsis-project/katharsis-core/issues/111) forgot to remove code after removing Apache BeamUtils (Patryk Orwat)  

**v1.0.1**  
2015-10-14    v1.0.1 (Patryk Orwat)  
2015-10-14    [#103](https://github.com/katharsis-project/katharsis-core/issues/103) work in progress (Patryk Orwat)  
2015-10-08    [#104](https://github.com/katharsis-project/katharsis-core/issues/104) NPE on removing ToOne relation using PATCH (Patryk Orwat)  
2015-10-08    [#99](https://github.com/katharsis-project/katharsis-core/issues/99) RelationshipRepository used only for operations on relations (Patryk Orwat)  

**v1.0.0**  
2015-10-01    v1.0.0 (Patryk Orwat)  
2015-10-01    [#95](https://github.com/katharsis-project/katharsis-core/issues/95) new resource save in one step (Patryk Orwat)  
2015-10-01    [#91](https://github.com/katharsis-project/katharsis-core/issues/91) added ability to hide to-many relationships (Patryk Orwat)  
2015-10-01    [#85](https://github.com/katharsis-project/katharsis-core/issues/85) can post resources using inheritance (Patryk Orwat)  
2015-09-30    [#85](https://github.com/katharsis-project/katharsis-core/issues/85) resourceEntry can contain information about parent resource (Patryk Orwat)  
2015-09-30    katharsis-core-79 Nested @JsonApiIncludeByDefault (Błażej Krysiak)  
2015-09-29    [#92](https://github.com/katharsis-project/katharsis-core/issues/92) Adding test (Zachary Taylor)  
2015-09-29    Resolve ExceptionMapperRegistry not found when search path contains comma seperated list (Zachary Taylor)  
2015-09-29    [#89](https://github.com/katharsis-project/katharsis-core/issues/89) added LinksInformation and LinksRepository (Patryk Orwat)  
2015-09-07    Support UUID in StandardTypeParsers (Björn Harrtell)  

**v0.9.4**  
2015-08-30    v0.9.4 (Patryk Orwat)  
2015-08-30    javadoc (Patryk Orwat)  
2015-08-30    v0.9.4 (Patryk Orwat)  
2015-08-30    katharsis-core-43 Display a list of found resources [#43](https://github.com/katharsis-project/katharsis-core/issues/43) (Błażej Krysiak)  
2015-08-30    [#7](https://github.com/katharsis-project/katharsis-core/issues/7) removed one meta information repository (Patryk Orwat)  
2015-08-30    katharsis-core-36 'Hardening' the codebase (Błażej Krysiak)  
2015-08-30    removed old code (Patryk Orwat)  
2015-08-29    [#7](https://github.com/katharsis-project/katharsis-core/issues/7) finished working on the meta information (Patryk Orwat)  
2015-08-26    javadoc (Patryk Orwat)  
2015-08-25    [#7](https://github.com/katharsis-project/katharsis-core/issues/7) added new repository interfaces (Patryk Orwat)  
2015-08-25    close [#70](https://github.com/katharsis-project/katharsis-core/issues/70) improved (Patryk Orwat)  
2015-08-24    [#70](https://github.com/katharsis-project/katharsis-core/issues/70) utils now support more getters (Patryk Orwat)  
2015-08-24    close [#53](https://github.com/katharsis-project/katharsis-core/issues/53) - resources without resource repository can have relationship repositories (Patryk Orwat)  
2015-08-23    javadoc (Patryk Orwat)  
2015-08-21    Allow @JsonApiId, @JsonApiToOne, @JsonApiToMany and @JsonApiIncludeByDefault to be accessible as getter. (Błażej Krysiak)  
2015-08-21    Support annotations search [#70](https://github.com/katharsis-project/katharsis-core/issues/70) (Błażej Krysiak)  
2015-08-21    Support annotations search [#70](https://github.com/katharsis-project/katharsis-core/issues/70) (Błażej Krysiak)  
2015-08-20    [#53](https://github.com/katharsis-project/katharsis-core/issues/53) resource can have no repository (Patryk Orwat)  
2015-08-17    [#69](https://github.com/katharsis-project/katharsis-core/issues/69) slf4j (Patryk Orwat)  
2015-08-17    [#65](https://github.com/katharsis-project/katharsis-core/issues/65) resource inheritance support (Patryk Orwat)  
2015-08-17    [#62](https://github.com/katharsis-project/katharsis-core/issues/62) small fix (Patryk Orwat)  
2015-08-17    [#62](https://github.com/katharsis-project/katharsis-core/issues/62) fixed inclusion + code refactor (added an abstraction layer over java.lang.reflect.Field) (Patryk Orwat)  
2015-08-15    [#62](https://github.com/katharsis-project/katharsis-core/issues/62) removed dependency to Apache BeanUtils - TODO fix inclusion (Patryk Orwat)  
2015-08-12    [#62](https://github.com/katharsis-project/katharsis-core/issues/62) path builder fix (Patryk Orwat)  
2015-08-11    [#59](https://github.com/katharsis-project/katharsis-core/issues/59) small tests (Patryk Orwat)  
2015-08-04    katharsis-core-59 [#59](https://github.com/katharsis-project/katharsis-core/issues/59) fixed upsert deserialization problem (Patryk Orwat)  
2015-07-31    readme (Patryk Orwat)  

**v0.9.3**  
2015-07-31    v0.9.3 (Patryk Orwat)  
2015-07-30    katharsis-core-12 Add projection of fields (sparse fields) (Błażej Krysiak)  
2015-07-25    [#56](https://github.com/katharsis-project/katharsis-core/issues/56) ParserException is also KatharsisMatchingException (Patryk Orwat)  
2015-07-25    small fix (Patryk Orwat)  
2015-07-25    [#56](https://github.com/katharsis-project/katharsis-core/issues/56) katharsis-core-56 Improve katharsis-core method matching (Patryk Orwat)  
2015-07-13    Exception constructor fix (Grzegorz Poznachowski)  
2015-07-12    Refactor JsonSerializationException (Grzegorz Poznachowski)  
2015-07-12    Added pledgie link (Błażej Krysiak)  
2015-07-06    katharsis-core-50 Fix incompatibilities to JSON API links definition (Patryk Orwat)  

**v0.9.2**  
2015-06-25    v0.9.2 (Patryk Orwat)  
2015-06-25    code refactor (Patryk Orwat)  
2015-06-17    refactor - less Container usage (Patryk Orwat)  
2015-06-17    Started integration test to map exception (Grzegorz Poznachowski)  
2015-06-17    Removed not used constant (Grzegorz Poznachowski)  
2015-06-17    ErrorResponseSerializer serializes ErrorData according to the JSON:API standard (while keeping ErrorData object flat and simple) (Grzegorz Poznachowski)  
2015-06-16    ErrorData model changes to accomodate JSON:API 1.0 format (Grzegorz Poznachowski)  
2015-06-16    register a serializer for ErrorResponse by default. (Woonsan Ko)  
2015-06-14    Naming typo. (Błażej Krysiak)  
2015-06-13    ignoring transient and @JsonIgnore annotated fields (Patryk Orwat)  
2015-06-13    [#11](https://github.com/katharsis-project/katharsis-core/issues/11) work in progress (Patryk Orwat)  
2015-06-11    [#11](https://github.com/katharsis-project/katharsis-core/issues/11) contract change (Patryk Orwat)  
2015-06-11    Added maven central badge (Błażej Krysiak)  

**v0.9.1**  
2015-06-09    v0.9.1 (Patryk Orwat)  
2015-06-09    [#34](https://github.com/katharsis-project/katharsis-core/issues/34) parent update, javadoc (Patryk Orwat)  
2015-06-09    [#34](https://github.com/katharsis-project/katharsis-core/issues/34) added relationships controllers (Patryk Orwat)  
2015-06-08    [#34](https://github.com/katharsis-project/katharsis-core/issues/34) working in progress (Patryk Orwat)  
2015-06-08    [#34](https://github.com/katharsis-project/katharsis-core/issues/34) extended relationship repository (Patryk Orwat)  
2015-06-07    oss sonatype (Patryk Orwat)  
2015-06-03    bintray badge fix (Patryk Orwat)  

**v0.9.0**  
2015-06-01    v0.9.0 (Patryk Orwat)  
2015-06-01    updated repositories (Patryk Orwat)  
2015-06-01    added nested crud, links -> relationships in URLs :dog: (Patryk Orwat)  
2015-05-30    katharsis-core-40 Change linked to relationships [#40](https://github.com/katharsis-project/katharsis-core/issues/40) (Patryk Orwat)  
2015-05-30    katharsis-core-40 Change linked to relationships (Patryk Orwat)  
2015-05-25    smallfix, docs (Patryk Orwat)  
2015-05-21    Update JsonApiId.java (Patryk Orwat)  
2015-05-20    Added tests for RequestDispatcher to make sure it maps exceptions to ErrorResponse properly (Grzegorz Poznachowski)  
2015-05-19    Changed from Runtime to ResourceException (Grzegorz Poznachowski)  
2015-05-19    make use of Exception message. Passing the detail part there (Grzegorz Poznachowski)  
2015-05-19    Fixed some tests to work with latest exception changes (Grzegorz Poznachowski)  
2015-05-19    package renamed in test (Grzegorz Poznachowski)  
2015-05-19    package rename to follow standard convention (Package names are written in all lower case to avoid conflict with the names of classes or interfaces) (Grzegorz Poznachowski)  
2015-05-19    ParserException refactored minor fixed (imports etc) added @JsonIgnore on the httpStatus of BaseResponse - we don't want to return it in the body Refactored exceptions thrown in the code (Grzegorz Poznachowski)  
2015-05-19    Added InvalidResourceException to indicate initialization issue (when annotated exception mapper does not implements JsonApiExceptionMapper) KatharsisExceptionMapper registered by default (Grzegorz Poznachowski)  
2015-05-18    Adding ExceptionMapperType used in ExceptionMapperRegistry as a matcher between Exception class and corresponding Exception mapper (Grzegorz Poznachowski)  
2015-05-18    Existing exception to derive from KatharsisException or KatharsisInitializationException (Grzegorz Poznachowski)  
2015-05-18    Added interface containing common HTTP status codes (Grzegorz Poznachowski)  
2015-05-18    Introduced 2 Katharsis general purpose exceptions. Added default KatharsisExceptionMapper (Grzegorz Poznachowski)  
2015-05-18    Added error response tests (Grzegorz Poznachowski)  
2015-05-18    Added Error data object, which reflects JSON API error data  (along with builder) (Grzegorz Poznachowski)  
2015-05-17    Added HttpMethod enum, refactored String constants in Controllers. Proper error handling in controllers (Grzegorz Poznachowski)  
2015-05-17    Added proper Exception handling (Grzegorz Poznachowski)  
2015-05-17    documentation to annotations (Patryk Orwat)  
2015-05-16     removed javassist, added JsonProperty support, closes [#35](https://github.com/katharsis-project/katharsis-core/issues/35) (Patryk Orwat)  
2015-05-15    Test fix (Grzegorz Poznachowski)  
2015-05-15    Initial implementation of error handling. (Grzegorz Poznachowski)  
2015-05-13    [#35](https://github.com/katharsis-project/katharsis-core/issues/35) javassist is a hell - created Data field (Patryk Orwat)  
2015-05-12    [#35](https://github.com/katharsis-project/katharsis-core/issues/35) javassist work in progress (Patryk Orwat)  
2015-05-11    linkage deserialization fix (Patryk Orwat)  
2015-05-10    code refactor (Patryk Orwat)  
2015-05-09    [#33](https://github.com/katharsis-project/katharsis-core/issues/33) interface changes, CollectionGet update, TypeParser update (Patryk Orwat)  
2015-05-09    [#33](https://github.com/katharsis-project/katharsis-core/issues/33) interface changes, docs (Patryk Orwat)  
2015-05-09    katharsis-core-22 Add more sophisticated way of casting resource's Id values [#22](https://github.com/katharsis-project/katharsis-core/issues/22) (Patryk Orwat)  
2015-05-07    merge (Patryk Orwat)  
2015-05-07    katharsis-core-17 Allow updating resources [#17](https://github.com/katharsis-project/katharsis-core/issues/17) (Patryk Orwat)  
2015-05-07    katharsis-core-31 Add attributes field (Patryk Orwat)  
2015-05-06    Refactored ResourceInformationBuilder, covered duplicated @JsonApiId occurence. (Grzegorz Poznachowski)  
2015-05-04    fixed adding resource with multiple relationship (Patryk Orwat)  
2015-05-03    Made class final, updated equals and hashCode (Grzegorz Poznachowski)  
2015-05-03    tests for extended resources id casting (Patryk Orwat)  
2015-05-03    extended resources id casting, refactored ControllerRegistryBuilder (Patryk Orwat)  
2015-05-03    fixed problem with null resource response (Patryk Orwat)  
2015-05-03    smallfix (Patryk Orwat)  
2015-05-02    Merge branch 'development' into katharsis-core-16 (Patryk Orwat)  
2015-05-02    katharsis-core-16 added tests, small fix [#16](https://github.com/katharsis-project/katharsis-core/issues/16) (Patryk Orwat)  
2015-05-02    Added paging and sorting repositories. (Błażej Krysiak)  
2015-05-02    katharsis-core-16 Allow adding resources [#16](https://github.com/katharsis-project/katharsis-core/issues/16) (Patryk Orwat)  
2015-05-02    katharsis-core-14 Add pagination (Błażej Krysiak)  
2015-05-02    katharsis-core-16 Allow adding resources (Patryk Orwat)  
2015-05-01    context renamed to locator (Patryk Orwat)  
2015-05-01    katharsis-core-13 Added sorting params handling (Błażej Krysiak)  
2015-05-01    added resource removal, closes [#19](https://github.com/katharsis-project/katharsis-core/issues/19) (Patryk Orwat)  
2015-04-30    [#6](https://github.com/katharsis-project/katharsis-core/issues/6) improved tests + small fixes (Patryk Orwat)  
2015-04-30    [#6](https://github.com/katharsis-project/katharsis-core/issues/6) added the implementation (Patryk Orwat)  
2015-04-29    moved serializers to separate package (Patryk Orwat)  
2015-04-29    [#6](https://github.com/katharsis-project/katharsis-core/issues/6) annotation usage, small fix (Patryk Orwat)  
2015-04-27    pom refactored (Grzegorz Poznachowski)  
2015-04-27    reverted to deploy (Grzegorz Poznachowski)  
2015-04-27    mvn deploy:deploy instead of deploy, to skip previous phases (Grzegorz Poznachowski)  
2015-04-27    don't clean when doing coverall (Grzegorz Poznachowski)  
2015-04-26    trying to fix coverall (Grzegorz Poznachowski)  
2015-04-26    split deploy and jacoco (Grzegorz Poznachowski)  
2015-04-26    added jacoco:report to travis (Grzegorz Poznachowski)  
2015-04-26    Removed syso (Grzegorz Poznachowski)  
2015-04-26    Added field checking against synthetic fields, to enable using reflection methods along with Jacoco agent Dependencies version extracted to properties (Grzegorz Poznachowski)  
2015-04-20    Switched to Jacoco, Let travis make everything in one build (Grzegorz Poznachowski)  
2015-04-20    poms using parent (Grzegorz Poznachowski)  
2015-04-17    [#6](https://github.com/katharsis-project/katharsis-core/issues/6) added annotation (Patryk Orwat)  
2015-04-17    dependencies version update (Patryk Orwat)  
2015-04-16    documentation update, closes [#9](https://github.com/katharsis-project/katharsis-core/issues/9) (Patryk Orwat)  
2015-04-15    removed top level links (Patryk Orwat)  
2015-04-13    added top level links (Patryk Orwat)  
2015-04-13    added JsonPath to String (Patryk Orwat)  
2015-04-12    Pulled-up ObjectMapper. (Błażej Krysiak)  
2015-04-12    Merge fixes. (Błażej Krysiak)  
2015-04-12    Extended implementation of fields passed to RequestDispatcher (Błażej Krysiak)  
2015-04-12    added jackson documentation (Patryk Orwat)  
2015-04-09    added FieldResourceGet (Patryk Orwat)  
2015-04-09    documentation (Patryk Orwat)  
2015-04-09    new definition of relationship within resource definition (Patryk Orwat)  
2015-04-09    Added params handling and started working on QueryParamsBuilder tests. (Błażej Krysiak)  
2015-04-09    Building query params (Błażej Krysiak)  
2015-04-09    implemented LinkResourceGet (Patryk Orwat)  
2015-04-06    improved code coverage ;) (Patryk Orwat)  
2015-04-05    working on GET requests for links (Patryk Orwat)  
2015-04-04    fixed repository interface (Patryk Orwat)  
2015-04-04    extracted linkage serialization (Patryk Orwat)  
2015-04-04    improved documentation and changed hashCode and equals (Patryk Orwat)  
2015-04-04    improved Jackson integration (Patryk Orwat)  
2015-04-04    added ToMany linkage (Patryk Orwat)  
2015-04-03    added ToOne relationship serialization (Patryk Orwat)  
2015-04-03    added simple relationship serialization (Patryk Orwat)  
2015-04-02    improved serialization tests (Patryk Orwat)  
2015-04-01    added basic serialization tests (Patryk Orwat)  
2015-03-30    more restricted links (Patryk Orwat)  
2015-03-29    javadoc fix (Patryk Orwat)  
2015-03-29    improved JsonPath (Patryk Orwat)  
2015-03-25    renamed ResourcePath to JsonPath, started links support (Patryk Orwat)  
2015-03-25    Removed unused web-hook. (Błażej Krysiak)  
2015-03-25    Smallfix (Błażej Krysiak)  
2015-03-25    Webhooks fix (Błażej Krysiak)  
2015-03-25    Webhooks integrations with gitter. (Błażej Krysiak)  
2015-03-25    Fixed tests. (Błażej Krysiak)  
2015-03-25    Updated ResourceRepository and controller objects. (Błażej Krysiak)  
2015-03-23    last travis fix (Patryk Orwat)  
2015-03-23    fixed travis (Patryk Orwat)  
2015-03-23    fixed deployment (Patryk Orwat)  
2015-03-23    Removed travis curl to bintray. (Błażej Krysiak)  
2015-03-23    added serializator (Patryk Orwat)  
2015-03-22    added jackson (Patryk Orwat)  
2015-03-22    Testing bintray. (Błażej Krysiak)  
2015-03-22    Smallfix (Błażej Krysiak)  
2015-03-22    Testing Bintray integration. (Błażej Krysiak)  
2015-03-22    Testing Bintray integration. (Błażej Krysiak)  
2015-03-22    Testing Bintray integration. (Błażej Krysiak)  
2015-03-19    added ControllerRegistryBuilder, small fix (Patryk Orwat)  
2015-03-19    small fix (Patryk Orwat)  
2015-03-16    added resource inforation class (Patryk Orwat)  
2015-03-16    Added Gitter badge (The Gitter Badger)  
2015-03-15    added controller tests (Patryk Orwat)  
2015-03-15    added ResourceRegistry and ResourceRegistryBuilder (Patryk Orwat)  
2015-03-15    Testing Bintray integration (Błażej Krysiak)  
2015-03-15    Testing Bintray integration. (Błażej Krysiak)  
2015-03-15    Added ControllerRegistry test; (Błażej Krysiak)  
2015-03-15    Added test for dispatching Resource and Collection GET. (Błażej Krysiak)  
2015-03-15    Dispatching the route based on path and request type. (Błażej Krysiak)  
2015-03-15    fixed PathIds (Patryk Orwat)  
2015-03-14    coveralls fix (Błażej Krysiak)  
2015-03-14    added cobertura (Błażej Krysiak)  
2015-03-14    Coveralls Maven Plugin (Błażej Krysiak)  
2015-03-14    Smallfix + enabled coveralls coverage (Błażej Krysiak)  
2015-03-14    add waffle.io badge (Making GitHub Delicious.)  
2015-03-14    Added travis and coveralls badges. (Błażej Krysiak)  
2015-03-14    Fixed Travis supported Java JDK version. (Błażej Krysiak)  
2015-03-14    Travis support (Błażej Krysiak)  
2015-03-14    Implemented collection and resource response. (Błażej Krysiak)  
2015-03-14    Added request dispatching and model-resource classes. (Błażej Krysiak)  
2015-03-13    base repository interface (Patryk Orwat)  
2015-03-13    formatting, base repository interface (Patryk Orwat)  
2015-03-13    improved path implementation (Patryk Orwat)  
2015-03-13    Base path interpretation. (Błażej Krysiak)  
2015-03-12    Project set-up. (Błażej Krysiak)  
2015-03-11    Initial commit (Błażej Krysiak)  
