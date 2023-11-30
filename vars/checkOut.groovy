def checkOut(repoUrl) {
    git branch: 'main',
    url: '${repoUrl}'
}
