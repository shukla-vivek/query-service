# query-service
simple service to connenct with couchbase using certificate based authentication


To run this Spring-boot application,

java -Dcom.couchbase.certAuthEnabled=true   -Dspring.profiles.active=dev  -Dmypath=/location_of_your_jks_or_keystore_file/something.jks   -Dcom.couchbase.connectTimeout=5000 -Dcom.couchbase.connectTimeout=10000 -jar query-service-0.0.5-SNAPSHOT.jar >>6.log


2.  -Dcom.couchbase.connectTimeout=5000 -Dcom.couchbase.connectTimeout=10000
     these are option paramters, you can skip that
     I have used , hust for testing

