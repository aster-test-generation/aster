import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_package_dict(self):
        package = Package()
        package.name = 'example_package'
        package.arch = 'x86_64'
        package.epoch = 1
        package.release = '1.0'
        package.version = '1.0.0'
        package.repoid = 'example_repo'
        package.installtime = 1234567890

        result = DnfModule._package_dict(package)

        self.assertEqual(result['name'], 'example_package')
        self.assertEqual(result['arch'], 'x86_64')
        self.assertEqual(result['epoch'], '1')
        self.assertEqual(result['release'], '1.0')
        self.assertEqual(result['version'], '1.0.0')
        self.assertEqual(result['repo'], 'example_repo')
        self.assertEqual(result['envra'], '1:example_package-1.0.0-1.0.x86_64')
        self.assertEqual(result['nevra'], '1:example_package-1.0.0-1.0.x86_64')
        self.assertEqual(result['yumstate'], 'installed')

if __name__ == '__main__':
    unittest.main()