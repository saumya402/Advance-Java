
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Voting Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

    <div class="container mt-5" style="max-width: 500px;">

        <div class="card shadow p-4">

            <h1 class="text-center mb-4">Voting Form</h1>

            <form action="VoteServlet" method="post">

                <!-- Name -->
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text"
                           class="form-control"
                           name="name"
                           placeholder="Enter your name"
                           >
                </div>

                <!-- Birth Year -->
                <div class="mb-3">
                    <label class="form-label">Birth Year</label>
                    <input type="number"
                           class="form-control"
                           name="year"
                           placeholder="Enter your birth year"
                          >
                </div>

                <!-- Gender -->
                <div class="mb-3">

                    <label class="form-label d-block">Gender</label>

                    <div class="form-check form-check-inline">
                        <input class="form-check-input"
                               type="radio"
                               name="gender"
                               value="male"
                               id="genderMale"
                               >

                        <label class="form-check-label"
                               for="genderMale">
                            Male
                        </label>
                    </div>

                    <div class="form-check form-check-inline">
                        <input class="form-check-input"
                               type="radio"
                               name="gender"
                               value="female"
                               id="genderFemale">

                        <label class="form-check-label"
                               for="genderFemale">
                            Female
                        </label>
                    </div>

                </div>

                <!-- Submit Button -->
                <div class="d-grid">
                    <input type="submit"
                           class="btn btn-primary"
                           value="Eligibility Check">
                </div>

            </form>

        </div>

    </div>

</body>
</html>


