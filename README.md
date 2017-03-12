Spring Reactor Ionic
====================

[![Build Status](https://travis-ci.org/okode/spring-reactor-ionic.svg?branch=master)](https://travis-ci.org/okode/spring-reactor-ionic)

Spring Reactor WebFlux, Server Side Events and Ionic2 Frontend.

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

* Ionic2

```
$ brew install node yarn
$ npm update -g
$ npm install -g ionic cordova ios-sim ios-deploy
```

Building and Running
--------------------

* Backend build & run

```
$ cd backend
$ ./gradlew bootRun
```

* Frontend build & run

```
$ cd frontend
$ yarn install
$ ionic platform add browser
$ ionic build browser
```

* Testing

```
$ ionic serve
```
