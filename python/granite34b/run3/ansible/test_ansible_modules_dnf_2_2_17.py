import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_parse_spec_group_file(self):
        dnf_module = DnfModule(module)
        pkg_specs, grp_specs, module_specs, filenames = dnf_module._parse_spec_group_file()
        self.assertEqual(pkg_specs, ['httpd', 'mariadb-server'])
        self.assertEqual(grp_specs, ['@Development tools'])
        self.assertEqual(module_specs, ['@postgresql:9.6/client'])
        self.assertEqual(filenames, ['http://nginx.org/packages/centos/6/noarch/RPMS/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/local/src/nginx-release-centos-6-0.el6.ngx.noarch.rpm', '/usr/bin/cowsay'])

if __name__ == '__main__':
    unittest.main()