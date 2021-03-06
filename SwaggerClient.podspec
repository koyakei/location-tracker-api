Pod::Spec.new do |s|
  s.name = 'SwaggerClient'
  s.ios.deployment_target = '13.0'
  s.osx.deployment_target = '10.11'
  s.tvos.deployment_target = '9.0'
  s.version = '0.0.1'
  s.source = { :git => 'git@github.com:koyakei/location-tracker-api.git', :tag => '1.1' }
  s.authors = 'Swagger Codegen'
  s.license = 'Proprietary'
  s.source_files = 'SwaggerClient/Classes/**/*.swift'
  s.dependency 'Alamofire', '~> 4.9.0'
  s.homepage = 'https://koyakei.kt'
  s.summary = 'swift location tracker api'
end
