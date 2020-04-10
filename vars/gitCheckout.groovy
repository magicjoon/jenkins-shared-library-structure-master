def call(Map stageParams) {

    checkout([
            $class: 'GitSCM',
            branches:[[ name: stageParams.branch]],
            userRemoteConfigs:[[ url: stageParams.url]]
    ])

    echo ' adding the git steps '
    sh " git pull ${url}"
}
