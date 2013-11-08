'use strict';

var cavesApp = angular.module('cavesApp', [ 'ngRoute', 'cavesControllers' ]);

cavesApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/seed', {
		templateUrl : 'views/seed.html',
		controller : 'CavesCtrl'
	}).when('/game', {
		templateUrl : 'views/game.html',
		controller : 'GameCtrl'
	}).when('/about', {
		templateUrl : 'views/about.html',
		controller : 'GameCtrl'
	}).when('/scores', {
		templateUrl : 'views/highscore.html',
		controller : 'CavesCtrl'
	}).otherwise({
		redirectTo : '/seed'
	});
} ]);