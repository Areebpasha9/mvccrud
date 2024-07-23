    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Registeration page!</title>
        <style>
            table {
                width: 50%;
                border-collapse: collapse;
            }

            table,
            th,
            td {
                border: 1px solid black;
            }

            th,
            td {
                padding: 10px;
                text-align: left;
            }
        </style>
    </head>

    <body>
        <h1 style="text-align: center;">Registeration Form</h1>
        <form action="/saveLaptopData" method="post" >
            <table>
                <tr>
                    <th>Laptop Id</th>
                    <td><input type="text" name="id" required> </td>
                </tr>
                <tr>
                    <th>Laptop Brand</th>
                    <td><input type="text" name="brand" required></td>
                </tr>
                <tr>
                    <th>Laptop Price</th>
                    <td><input type="text" name="price" required min="20000" ></td>
                </tr>
                
            </table>
            
            <button type="submit">submit</button>
        </form>
    </body>

    </html>