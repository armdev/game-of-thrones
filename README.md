

## Game of Thrones 

Benchmark of microservices in real production.

Spring boot microservices configured with

```
1 undertow
2 tomcat
3 reactive tomcat
4 webflux
```
Actuator shutdown hook enabled.

Each microservice has sheduler with fixed delay.


After start-up they starting shoot one to another and try to shut down enemy.

No Docker, No database.

Target shoot list has also fake endpoints to give opponents time for start.

You can start from any microservice.

Any pool requests are welcome!


<img src="shoot.gif" height="400px">
