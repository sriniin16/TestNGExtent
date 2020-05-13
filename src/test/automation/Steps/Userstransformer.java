//import io.cucumber.core.api.TypeRegistry;
//import io.cucumber.core.api.TypeRegistryConfigurer;
//import io.cucumber.datatable.DataTableType;
//import io.cucumber.datatable.TableCellTransformer;
//import io.cucumber.datatable.TableEntryTransformer;
//
//import java.util.Map;
//
//public class Userstransformer implements TypeRegistryConfigurer {
//    public void configureTypeRegistry(TypeRegistry typeRegistry) {
//        typeRegistry.defineDataTableType(new DataTableType(DataClass.class, new TableEntryTransformer<DataClass>()
//        {
//
//
//            public DataClass transform(Map<String, String> entry) throws Throwable {
//                String username = entry.get("username");
//                String password = entry.get("password");
//                return new DataClass(username,password);
//            }
//        }));
//
//    }
//}
