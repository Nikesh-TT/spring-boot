# SpringBoot
Spring Boot projects
<br/> Learn about pull requests: https://docs.github.com/en/free-pro-team@latest/github/collaborating-with-issues-and-pull-requests/about-pull-requests

<br/> Git Basic Commands
<br/> After making changes to the repository to stage the changes which are ready to commit use "git add <path_to_file>" or to add all files use "git add ."
<br/> To remove a added file from stagging use "git reset HEAD -- path/to/file" or to remove all stagged files at once use "git reset HEAD -- ."
<br/> To see all changes made and list of stagged and unstagged files use "git status"
<br/> To commit stagged changes with commit message use "git commit -m "removed wrong project, added .gitignore" "
<br/> To see log of all commit use "git log"
<br/> To see what changes are made to a file use "git difftool HEAD"
<br/> CF Commands:
<br/> cf apps: to view all the existing apps in the space
<br/> cf routes: lists all routes in the space
<br/> cf map-route blue-green-demo(app name) cfapps.us10.hana.ondemand.com(domain) --hostname blue-green-production(new route name): command to add a new route
<br/> cf push -f manifest-green.yml: push with configurations from a specific yml file
<br/> cf stop blue-green-demo: to stop the app
<br/> cf rename green-demo(current app name) blue-green-demo(new name): rename app
