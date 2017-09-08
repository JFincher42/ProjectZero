PUT YOUR BUILD STATUS LINK HERE

# Project Zero

This project will give you experience using GitHub and Eclipse to submit your projects for grading this year.

## Accepting the assignment

1. Go to www.github.com and create a username with your BSD email address. (You can use the free Unlimited public repositories.)
2. You should receive an email asking you to confirm your email address. Follow the directions in this email.
3. Go to https://classroom.github.com/a/nfBkAXjw and accept this assignment. (Each assignment will have a different link.)

After the starter code has finished copying over to your new repository you will be able to navigate to it.

## Enabling Travis CI

We will use Travis CI (Continuous Integration) to automatically build and run the unit test against your code everytime you push or submit a pull request.

1. Go to www.travis-ci.com/profile/NewportCS
2. Sign in with your GitHub username and password
3. You should see a list of your repositories. Make sure the toggle next to your Project Zero repository shows a check mark and not an X. Click the button if it is an X.

You have successfully enabled Travis CI! Now everytime you push your code to GitHub or submit a pull request to turn in your project it will automatically build and run the unit tests.

## Importing into Eclipse

Before you can start working on your code you need to first pull your repo from GitHub into Eclipse. Follow the below steps. 

1. On your repositories GitHub page click on the "Clone or download" button then copy the URL in the box.
2. Open Eclipse and then click "File" then "Import".
3. Click on the "Git" folder then "Projects from Git" then "Next".
4. Click on the "Clone URI" then "Next".
5. Paste what you copied in step 1 into the URI box in Eclipse. (The Host and Repository path will automatically be filled out.)
6. Enter your GitHub username and password in the "Authentication" section then click "Next".
7. Make sure both the "master" and "working" branches are checked and click "Next".
8. Change the initial branch to "working" then click "Next".
9. Make sure that "Import existing Eclipse projects" is selected then click "Next".
10. Make sure that your project is checked and click "Finish".

Your project has been successfully imported into Eclipse!

## Committing to the Working Branch

Now that your project is imported you can start making changes to files or adding new files. For this project we are just going to start by adding a link to our Travis CI build to the README.md in the working branch. This will allow you to easily glance at your repository and know if it is failing or passing the unit tests or to build.

1. Go back to www.travis-ci.com/profile/NewportCS and click on your project's name.
2. Click on the build image up at the top. (Should be either build unknown, build passes, or build failed.)
3. Change from Image URL to Markdown and copy what is in the text box.
4. Open the README.md in Eclipse.
5. Along the top of the file replace the "PUT YOUR BUILD STATUS LINK HERE" with what you just copied.
6. In what you just pasted change the "branch=master" to "branch=working" and save the file.

Now that we have made the change locally we still need to commit and push the change to GitHub. Follow these step to do that.

1. Right click on your project in the Eclipse Project Explorer.
2. Select "Team" then "Commit".
3. Add a message describing what you changed (Added build status to README) and make sure that all files you change/added are checked.
4. Click on "Commit and Push".
5. Enter your username and password if prompted.

Your changes have now been saved on GitHub! If you were to check your GitHub page you would see these changes.

## Creating a Pull Request (Submitting)

When you have finished an assignment and want to submit it for grading you will need to create a pull request. Follow these steps to do that.

1. Go to your repositories GitHub page. (www.github.com/NewportCS/NameOfYourProject)
2. Click "Pull requests" just below your project name.
3. Click "New pull request".
4. Make sure that the base is master and the compare is working. Then you should see all of your commits and the files that changed.
5. Click "Create pull request".
6. Change the description if needed. (Submitting Project Zero)
7. Click the gear icon next to Reviewers along the right.
8. Select Mr. Zukowski, "GrantZukowski".
9. Click "Create pull request".

Mr. Zukowski will get a notification that your project is ready for him to grade. He will then commit a change to the RUBRIC.md to reflect what your score on the project is and complete your pull request. If you have any changes after Mr. Zukowski has completed the pull request you will need to create a new pull request to get it graded.
