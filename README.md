Spring Reactor Ionic
====================

[![Build Status](https://travis-ci.org/okode/spring-reactor-ionic.svg?branch=master)](https://travis-ci.org/okode/spring-reactor-ionic)

Spring Reactor WebFlux, Server Side Events and Ionic Frontend with RxJS / Angular.

Requirements
------------

* Homebrew

```
$ brew update ; brew upgrade
```

* Java 8

```
$ brew cask install java
```

* Ionic

```
$ brew install node ios-sim ios-deploy
$ npm install -g ionic cordova
```

Building and Running
--------------------

* Backend build & run

```
$ cd backend
$ ./gradlew bootRun
```

or

```
$ cd backend
$ ./gradlew bootJar
$ cd build/libs
$ ./backend-[VERSION].jar
```

* Frontend build & run

```
$ cd frontend
$ npm install
$ ionic cordova platform add ios --nofetch
$ ionic cordova emulate ios
```

* Testing with curl

Retrieving all results as JSON array (blocking):

```
$ curl -H "Accept: application/json" http://localhost:8080/date/now/2
```

Retrieving all results as text/event-stream (default content type, non blocking)

```
$ curl http://localhost:8080/date/now/2
```

Retrieving all results as application/stream+json (non blocking)

```
$ curl -H "Accept: application/stream+json" http://localhost:8080/date/now/2
```
