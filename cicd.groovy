node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/re2cport.git'), string(name: 'PORT_DESCRIPTION', value: 're2c is a free and open-source lexer generator for C/C++, Go and Rust.' )]
  }
}
