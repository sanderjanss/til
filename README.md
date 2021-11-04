# TIL

`Today I Learned #TIL` is the flagship application of Switchfully.

With this piece of software, we will take over the world. 

Only ... there are a few bugs :-(

## Setup
* Use template
* Run `index.html` => right click + run
* Run the Spring Boot application

## Let's go bug hunting
* The package structure is horrible
  * Make an `api` package, which contains the controller
  * Make a `service` package, which contains the ... service :-)
  * Make a `repository` package
  * What about Person? What about Til?
* The UI is very buggy (aka it simply does not work) ... but the UI CANNOT BE CHANGED
  * Make changes to `Til.java` (if necessary, create DTOs)
  * Make sure to NOT change the Postman / Swagger UI (because the CEO uses this already)
* Potential problem
  * Why can't you delete #TILs? (This might already be solved, due to the dtos)

## Hints and extra's
* Use the debugger to explore / investigate
* The java code is horrible, feel free to refactor ;-)

## Future?
* In a next version
  * Dto's in Dto's (OwnerDto in TilDto)
  * Attach it to a real database
  * A better UI
