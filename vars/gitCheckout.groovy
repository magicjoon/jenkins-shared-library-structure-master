def call(Map stageParams) {

    checkout([
            $class: 'GitSCM',
            branches:[[ name: stageParams.branch]],
            userRemoteConfigs: [[ url: stageParams.url]],
            //git clone https://github.com/magicjoon/vertex-lib.git
    ])
}