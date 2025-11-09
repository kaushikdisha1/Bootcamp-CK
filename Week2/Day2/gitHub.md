
1. Configure SSH key in github account.
=>  ssh-keygen -t ed25519 -C "dishakaushik11299@gmail.com"
    eval "$(ssh-agent -s)"
    ssh-add ~/.ssh/id_ed25519
    cat ~/.ssh/id_ed25519.pub

->  ssh -T git@github.com (Hi username! You've successfully authenticated...)

->  Now clone repos using SSH:
    git clone git@github.com:username/repo-name.git


2. Create a repository on github account.
=>  cd project-folder
    git init
    git add .
    git commit -m “Initial commit”
    
Then add the GitHub remote:
    git remote add origin git@github.com:<username>/<reponame>.git
Push to GitHub:
    git push -u origin main/master


3. Clone the above repository on your local from github.
=>  Step 1: Copy the Repository URL:
            git@github.com:<username>/<reponame>.git
    Step 2: Clone the Repository in Terminal:
            cd ~/Documents
            git clone git@github.com:dishakaushik/project-name.git
    Step 3: Enter the Repository Folder:
            cd project-name
Project is now available locally and linked to GitHub using SSH.


4. Create a new file, say test.txt, in main/master branch. Make some changes to this file and commit the changes.
=>  Step 1: cd my-project (Go into cloned repo)
    Step 2: touch test.txt (Create new file)
    Step 3: nano test.txt (Open and edit the file)
    Step 4: git status (Check the file status)
    Step 5: git add test.txt (Add the file to staging)
    Step 6: git commit -m “Added test.txt file”
    Step 7: git push (Push the commits to GitHub)


5. Create two branches from main/master branch, say f1 and f2.
=>  Step 1: Check main/master branch
            git checkout main/master
    Step 2: Create branch f1
            git branch f1
    Step 3: Create branch f2
            git branch f2
    Step 4: Verify the branches
            git branch
    Step 5: To switch to branch f1
            git checkout f1
            git checkout f2


6. How can you resolve a merge conflict in Git, provide an example.
=> A merge conflict happens when two branches change the same line in a file and Git doesn't know which change to keep.

->  mkdir merge-demo
    cd merge-demo

->  git init
    echo "Hello Disha" > test.txt
    git add test.txt
    git commit -m "Init commit with test.txt"

->  git checkout -b feature
    echo "Changes is from feature branch "dishakaushik@CK-Disha..."
    git commit -am "Update test.txt in feature branch"

->  git checkout master/main
    echo "This change from master branch" > test.txt
    git commit -am "Update test.txt in main branch "

->  git merge feature

->  nano test.txt
    git commit -am "Update in master branch"
    git status
    git show


7. Show how divergence occurs in a branch.
=> Divergence happens when two branches start from the same commit, but then each branch gets different changes, creating different commit histories.

->  git checkout -b feature
    echo "This text is from feature branch" > test.txt
    git commit -am "Edit test.txt in feature branch"

->  git checkout main/master
    echo "This text is from main/master branch" > test.txt
    git commit -am "Edit test.txt in main/master branch"


8. Difference between git init and git clone.
=> git init: 
It creates a new empty repository from scratch. When
we are starting a new project and wants to track it with Git we use git init. It doesn’t download any files from anywhere. It creates a .git directory in the current folder.

git clone: 
It creates a copy of an existing repository. When we want to work on an already existing project hosted somewhere. It downloads all files, branches, commit history and automatically initializes the repo and sets remote origin.


9. Difference between git branch and git checkout.
=> git branch: 
To create, list, or delete branches. It does not move you to another branch. It only manages branch names. git branch new-feature creates a new branch.

git checkout: 
It is used to switch from one branch to another. It moves working directory to the selected branch and files change to match that branch. git checkout new-feature switches to the branch.


10. Difference between git fetch and git pull.
=> git fetch: 
It downloads the latest changes from the remote repository to local repository. It does not modify the working files. The changes are stored in local remote-tracking branches and used to see what is new before applying the changes. It is safe to use.

git pull: 
Downloads the latest changes and directly merges them into the current branch. Updates the working files immediately. It is used when we are ready to update the local code with remote changes.


11. How to squash commits?
=> Squashing commits means combining multiple commits into one single commit. This is done to keep the commit history clean and organized. 
Steps:  A. git log --oneline
        B. git rebase -i HEAD~3
        C. pick commit1
            pick commit2
            pick commit3
        D. pick commit1
            squash commit2
            squash commit3
        E. git push --force 


12. Show the difference between git reset and git revert.
=> git reset: 
It moves the branch pointer backward and removes commits. It can rewrites or deletes history. It is not safe. It can be used when we want to completely undo commits locally.

git revert: 
It creates a new commit that undoes the changes of a previous commit. History remains clean and visible. Safer than reset. It can be used when we want to undo changes on a branch that others may also be using. 


13. Delete branch from local and remote.
=>  DELETE A BRANCH LOCALLY:

    A. git branch -d feature-branch (This deletes the branch only if it has been merged).
    B. git branch -D feature-branch (If the branch is not merged and we want to forcefully delete it).

DELETE A BRANCH FROM REMOTE:
    git push origin --delete feature-branch
