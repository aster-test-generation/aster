import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.compat.version import LooseVersion
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test_ensure_dnf(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertIsNotNone(dnf_module.dnf)

    def test_configure_base(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        self.assertIsNotNone(dnf_module.conf)

    def test_install(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        dnf_module.install()
        self.assertEqual(dnf_module.module.exit_json.call_count, 1)

    def test_remove(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        dnf_module.remove()
        self.assertEqual(dnf_module.module.exit_json.call_count, 1)

    def test_list(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        dnf_module.list()
        self.assertEqual(dnf_module.module.exit_json.call_count, 1)

    def test_update_cache(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        dnf_module.update_cache()
        self.assertEqual(dnf_module.module.exit_json.call_count, 1)

    def test_has_package(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        dnf_module._configure_base(dnf_module.dnf.base, None, False)
        dnf_module.has_package()
        self.assertEqual(dnf_module.module.exit_json.call_count, 1)

if __name__ == '__main__':
    unittest.main()