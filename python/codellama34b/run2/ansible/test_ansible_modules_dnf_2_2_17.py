import unittest
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = DnfModule(None)
        self.assertEqual(module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(module.pkg_mgr_name, 'dnf')
        self.assertEqual(module.allowerasing, None)
        self.assertEqual(module.nobest, None)

    def test_parse_spec_group_file(self):
        module = DnfModule(None)
        module.names = ['httpd', 'mariadb-server', 'http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/local/src/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/bin/cowsay', '@Development tools', 'httpd', 'http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/local/src/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/bin/cowsay', '@Development tools', '@postgresql:9.6/client', '@postgresql:9.6', '@postgresql/client']
        pkg_specs, grp_specs, module_specs, filenames = module._parse_spec_group_file()
        self.assertEqual(pkg_specs, ['httpd', 'mariadb-server', 'http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/local/src/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/bin/cowsay', 'httpd'])
        self.assertEqual(grp_specs, ['@Development tools', '@postgresql:9.6/client', '@postgresql:9.6', '@postgresql/client'])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, ['http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/local/src/nginx-release-centos-6-0.el6.ngx.noarch.rpm'])

if __name__ == '__main__':
    unittest.main()