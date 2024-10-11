import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):

    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=yumdnf_argument_spec,
            supports_check_mode=True
        )
        self.dnf = DnfModule(self.module)

    def test_package_dict(self):
        package = MagicMock()
        package.name = 'example_package'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1.0'
        package.version = '1.0.0'
        package.repoid = 'example_repo'
        package.installtime = 0
        result = self.dnf._package_dict(package)
        expected = {
            'name': 'example_package',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1.0',
            'version': '1.0.0',
            'repo': 'example_repo',
            'envra': '0:example_package-1.0.0-1.0.x86_64',
            'nevra': '0:example_package-1.0.0-1.0.x86_64',
            'yumstate': 'available'
        }
        self.assertEqual(result, expected)

    def test_package_dict_installed(self):
        package = MagicMock()
        package.name = 'example_package'
        package.arch = 'x86_64'
        package.epoch = 0
        package.release = '1.0'
        package.version = '1.0.0'
        package.repoid = 'example_repo'
        package.installtime = 1632451200
        result = self.dnf._package_dict(package)
        expected = {
            'name': 'example_package',
            'arch': 'x86_64',
            'epoch': '0',
            'release': '1.0',
            'version': '1.0.0',
            'repo': 'example_repo',
            'envra': '0:example_package-1.0.0-1.0.x86_64',
            'nevra': '0:example_package-1.0.0-1.0.x86_64',
            'yumstate': 'installed'
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()