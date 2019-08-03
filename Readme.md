**Universal Sentense Encoder API**

<<<<<<< HEAD
Provides api to 
=======
Provides api to generate co-relation between sentenses using _multilingual universal sentence encoder_

This micro service provide interface for interacting with tensorflow sentense encoder.


To run project

`mvn clean install -DskipTests`

`cd target/`
 
`java -jar sentence-encoder-0.0.1-SNAPSHOT.jar`

Along with python project located at `git@github.com:saumyasuhagiya/tf-sensor-encoder.git`

We can scale up/down python tf instances according to load.

Security layer and other parameters and db related operations can be taken care by java service


Postman curl:

`curl -X POST \
   http://localhost:20990/v1/encoder/generateMapping \
   -H 'Accept: */*' \
   -H 'Accept-Encoding: gzip, deflate' \
   -H 'Cache-Control: no-cache' \
   -H 'Connection: keep-alive' \
   -H 'Content-Length: 98' \
   -H 'Content-Type: application/json' \
   -H 'Cookie: JSESSIONID=CFC7625011A1F5AEE10B7BB87A703DBF' \
   -H 'Host: localhost:20990' \
   -H 'Postman-Token: 779a1ea9-a0ba-4532-a84e-418715f63e5f,190eaa42-047b-483d-8386-37024d8cf8d1' \
   -H 'User-Agent: PostmanRuntime/7.15.2' \
   -H 'cache-control: no-cache' \
   -d '{
     "sentences": [
         " સર",
         "BCD",
         "EFG"
     ],
     "version": "1.1"
 }'`
>>>>>>> Initial commit
