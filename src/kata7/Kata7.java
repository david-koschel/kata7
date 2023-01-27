package kata7;

import static spark.Spark.get;

public class Kata7 {
    public static void main(String[] args) {
        FlightApp app = new FlightApp();

        get("/hello", (req, res) -> "Hello World");

        get("/hello/:name", (req, res) -> {
            return "Hello " + req.params(":name");
        });

        get("/flights/all", (req, res) -> {
            return app.getAll();
        });

        get("/flights/day/:day", (req, res) -> {
            return app.getDay(req.params(":day"));
        });

        get("/flights/distance/bigger/:distance", (req, res) -> {
            return app.getBiggerDistance(req.params(":distance"));
        });

        get("/flights/distance/lower/:distance", (req, res) -> {
            return app.getLowerDistance(req.params(":distance"));
        });

        get("/flights/cancelled", (req, res) -> {
            return app.getCancelled();
        });

        get("/flights/diverted", (req, res) -> {
            return app.getDiverted();
        });

    }
}