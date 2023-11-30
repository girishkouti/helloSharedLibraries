def checkOut(repoUrl) {
    git branch: 'master',
    url: '${repoUrl}'
}
