package com.example;

//Technically should probably be saved in a strings XML somewhere, but I did it this way and I'm not changing it now.
public class WebOutput {
    public static final String HTML_TOP =
            "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "<title></title>\n" +
                    "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\"\n" +
                    "integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\n" +
                    "</head>\n" +
                    "<body>\n";

    public static final String HTML_BOTTOM =
            "    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"\n" +
                    "integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n" +
                    "crossorigin=\"anonymous\"></script>\n" +
                    "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"\n" +
                    "integrity=\"sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF\"\n" +
                    "crossorigin=\"anonymous\"></script>\n" +
                    "</body>\n" +
                    "</html>";

    public static final String DELETE_FORM =
            "<div class=\"container\">\n" +
                    "<form action=\"delete\" method=\"post\">\n" +
                    "<input type=\"hidden\" name=\"id\" value=\"%d\" />" +
                    "<div class=\"form-group row\">\n" +
                    "<label for=\"name\">Name: </label>\n" +
                    "<div id=\"name\">%s</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group row\">\n" +
                    "<label for=\"email\">E-mail: </label>\n" +
                    "<div id=\"email\">%s</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group row\">\n" +
                    "<label for=\"gender\">Gender: </label>\n" +
                    "<div id=\"gender\">%s</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group row\">\n" +
                    "<label for=\"country\">Country: </label>\n" +
                    "<div id=\"country\">%s</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group\">\n" +
                    "<div class=\"row\">\n" +
                    "<button type=\"submit\" class=\"btn btn-danger\">Delete</button>\n" +
                    "<a href=\"employees\" class=\"btn btn-success\">Cancel</a>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</form>\n" +
                    "</div>";

    public static final String ADD_EMPLOYEE_FORM =
            "<div class=\"container\">\n" +
                    "<form action=\"add\" method=\"post\">\n" +
                    "<div class=\"form-group\">\n" +
                    "<label for=\"name\">Name: </label>\n" +
                    "<div>\n" +
                    "<input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" value=\"%s\" placeholder=\"Enter Name\">\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group\">\n" +
                    "<label for=\"email\">E-mail: </label>\n" +
                    "<div>\n" +
                    "<input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" value=\"%s\" placeholder=\"Enter E-mail\">\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "<div>\n" +
                    "<label for=\"gender\">Gender: </label>\n" +
                    "<div class=\"form-group\" id=\"gender\">\n" +
                    "<div class=\"form-check-inline\">\n" +
                    "<label class=\"form-check-label\">\n" +
                    "<input type=\"radio\" class=\"form-check-input\" name=\"gender\" id=\"male\" %s value=\"MALE\">Male\n" +
                    "</label>\n" +
                    "</div>\n" +
                    "<div class=\"form-check-inline\">\n" +
                    "<label class=\"form-check-label\">\n" +
                    "<input type=\"radio\" class=\"form-check-input\" name=\"gender\" id=\"female\" %s value=\"FEMALE\">Female\n" +
                    "</label>\n" +
                    "</div>\n" +
                    "<div class=\"form-check-inline\">\n" +
                    "<label class=\"form-check-label\">\n" +
                    "<input type=\"radio\" class=\"form-check-input\" name=\"gender\" id=\"other\" %s value=\"OTHER\">Other\n" +
                    "</label>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group\">\n" +
                    "<label for=\"country\">Country: </label>\n" +
                    "<div>\n" +
                    "<input type=\"text\" class=\"form-control\" name=\"country\" id=\"country\" value=\"%s\" placeholder=\"Enter Country\">\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "<div class=\"form-group\">\n" +
                    "<div class=\"row\">\n" +
                    "<button type=\"submit\" class=\"btn btn-primary\">Save</button>\n" +
                    "<a href=\"employees\" class=\"btn btn-danger\">Cancel</a>\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "</form>\n" +
                    "</div>";

    public static final String EMPLOYEE_TABLE_TOP =
            "<table class=\"table table-striped table-hover table-bordered\" id=\"displayPosts\">\n" +
                    "<thead class=\"thead-dark\">\n" +
                    "<tr>\n" +
                    "<th scope=\"col\">Name</th>\n" +
                    "<th scope=\"col\">E-mail</th>\n" +
                    "<th scope=\"col\">Gender</th>\n" +
                    "<th colspan=\"2\"scope=\"col\">Country</th>\n" +
                    "</tr>\n" +
                    "</thead>\n" +
                    "<tbody>\n";

    public static final String EMPLOYEE_TABLE_BOTTOM =
            "</tbody>\n" +
                    "</table>";

    public static final String UPDATE_DELETE_BUTTONS =
            "<div class=\"row self-align-center\">\n" +
                    "<a class=\"btn btn-primary btn-sm\" name=\"update\" href=\"update?id=%d\">Update</a>\n" +
                    "<a class=\"btn btn-danger btn-sm\" name=\"delete\" href=\"delete?id=%d\">Delete</a>\n" +
                    "</div>\n";

    public static String getJSChangeTitle(String title) {
        return "document.title = \"" + title + "\";";
    }

    public static String getEmployeeTableRow(Employee employee) {
        String row = "";
        row += "<tr>\n";
        row += "<td>" + employee.getName() + "</td>\n";
        row += "<td>" + employee.getEmail() + "</td>\n";
        row += "<td>" + employee.getGender().toString() + "</td>\n";
        row += "<td>" + employee.getCountry() + "</td>\n";
        row += "<td>" + String.format(UPDATE_DELETE_BUTTONS, employee.getId(), employee.getId()) + "</td>\n";
        row += "</tr>";
        return row;
    }
}
