Scenario: Login with a valid-user

Given the user is on the Home page

And the user navigates to the Login page

And the user enters username and password
| Username || password   |
| ABC@!23  || qwerty@123 |
| cnd@25   || bghedbu@22 |
| jfgh@54  || ghroh@578  |

Then the successful login message is displayed with text:

“You have successfully logged into your account! There are multiple discount offers waiting for you!!”