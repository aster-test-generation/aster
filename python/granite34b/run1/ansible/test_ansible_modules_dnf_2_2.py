import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.dnf = DnfModule(self.module)

    def test_parse_spec_group_file(self):
        self.dnf.names = ['httpd', 'mariadb-server']
        pkg_specs, grp_specs, module_specs, filenames = self.dnf._parse_spec_group_file()
        self.assertEqual(pkg_specs, ['httpd', 'mariadb-server'])
        self.assertEqual(grp_specs, [])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, [])

    def test_parse_spec_group_file_with_url(self):
        self.dnf.names = ['http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm']
        pkg_specs, grp_specs, module_specs, filenames = self.dnf._parse_spec_group_file()
        self.assertEqual(pkg_specs, [])
        self.assertEqual(grp_specs, [])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, ['http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm'])

    def test_parse_spec_group_file_with_path(self):
        self.dnf.names = ['/usr/bin/cowsay']
        pkg_specs, grp_specs, module_specs, filenames = self.dnf._parse_spec_group_file()
        self.assertEqual(pkg_specs, [])
        self.assertEqual(grp_specs, [])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, ['/usr/bin/cowsay'])

    def test_parse_spec_group_file_with_group(self):
        self.dnf.names = ['@Development tools']
        pkg_specs, grp_specs, module_specs, filenames = self.dnf._parse_spec_group_file()
        self.assertEqual(pkg_specs, [])
        self.assertEqual(grp_specs, ['Development tools'])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, [])

    def test_parse_spec_group_file_with_module(self):
        self.dnf.names = ['@postgresql:9.6/client']
        pkg_specs, grp_specs, module_specs, filenames = self.dnf._parse_spec_group_file()
        self.assertEqual(pkg_specs, [])
        self.assertEqual(grp_specs, [])
        self.assertEqual(module_specs, ['postgresql:9.6/client'])
        self.assertEqual(filenames, [])

if __name__ == '__main__':
    unittest.main()