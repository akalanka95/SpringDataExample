 Spring Boot, H2, JPA, Hibernate Restful CRUD API 
 =====================================================
 This is an example regarding Restful CRUD API using Spring Boot, Mysql, Jpa and Hibernate.
 
 Spring Data
 =============
 Spring Data is a high level project developed by Spring community aimed at simplifying the data access operations for the applications.If you  are using Spring Data in your project, you are not going to write most of the low level data access operations like writing SQL query, DAO classes.Spring Data has the following sub-projects:

   *  Spring Data Commons
   *  Spring Data MongoDB
   *  Spring Data Redis
   *  Spring Data Solr
   *  Spring Data Gemfire
   *  Spring Data REST
   *  Spring Data Neo4j


   spring-boot-starter-parent -- loads all the default configurations required for the basic spring boot applications.
   spring-boot-starter-data-jpa -- dependency will download the files required for spring data jpa.
   spring-boot-starter-webis -- required because it is web based application to expose the REST endpoints.
    
   Spring Data Repositories
   =========================
    
   Repository
   ============
   
   If you are extending this interface, you have to declare your own methods and the implementations will be provided by the spring run-time. For this interface also we have to pass two parameters:type of the entity and type of the entity’s id field.Â This is the super interface for CrudRepository.
   
   CrudRepository
   ===============
   CrudRepository provides methods for the CRUD operations.
   *  T findOne(ID primaryKey)
   *  Iterable findAll()
   *  Long count()
   *  void delete(T entity)
   *  boolean exists(ID primaryKey)
   
   JpaRepository
   ==============
   
   JpaRepository returns List type of entities and CrudRepository returns Iterable type of entities.Where as JpaRepository extends from PagingAndSortingRepository which inturen extends from the CrudeRepository.
   
   
