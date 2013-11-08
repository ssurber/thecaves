'use strict';

var cavesControllers = angular.module('cavesControllers', []);

cavesControllers.controller('CavesCtrl', ['$scope', '$http', function CavesCtrl($scope, $http) {
	$scope.phones = [{'name':'bob'},{'name':'tom'}];
	$scope.seed = 0;
	$scope.greetings = 'hello';
	
	$scope.playGame = function() {
		var url = "/thecaves/service/thecaves/"+$scope.seed;
		$http.get(url).success(function(data){
			$scope.caves = data;
		}).error(function(data, status, headers, config) {
			alert("Error: " + data);
		});
	};
}]);

cavesControllers.controller('GameCtrl', ['$scope', function GameCtrl($scope) {
	$scope.phones = [{'name':'bob'},{'name':'tom'}];
	$scope.caves = 'Caves board goes here';
	$scope.greetings = "This is the game controler";
}]);