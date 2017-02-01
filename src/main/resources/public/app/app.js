(function () {
    angular
        .module("myApp",['ngRoute'])
        .config(function ($routeProvider, $locationProvider, $httpProvider) {
            $routeProvider.caseInsensitiveMatch = true;
            $routeProvider
                .when("/home", {
                    templateUrl : "app/views/home.html",
                    controller : "HomeController",
                    controllerAs: 'hm'
                })
                .when("/cavs", {
                    templateUrl : "app/views/cavs.html",
                    controller : "CavsController",
                    controllerAs : 'vm'
                })
                .when("/blog", {
                    templateUrl : "app/views/blog.html",
                    controller : "BlogController",
                    controllerAs : "bm"
                })
                .when("/cavs/:id", {
                    templateUrl : "app/views/cavsPlayer.html",
                    controller : "cavsPlayerController",
                    controllerAs : "cp"
                })
                .otherwise({
                    redirectTo: "/home"
                });


                $locationProvider.html5Mode(false).hashPrefix('');
        });
})();
