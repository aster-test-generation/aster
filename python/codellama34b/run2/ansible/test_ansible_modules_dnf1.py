
import unittest
from ansible.modules.dnf import DnfModule
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
__metaclass__ = type


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module)

    def test_run(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module.run()

    def test_ensure(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module.ensure()

    def test_list_items(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module.list_items(None)

    def test_base(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module._base(None, None, None, None, None)

    def test_ensure_dnf(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module._ensure_dnf()

    def test_list_items_present(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module._list_items_present(None)

    def test_list_items_absent(self):
        dnf_module = DnfModule(None)
        dnf_module.autoremove = False
        dnf_module.download_dir = None
        dnf_module.update_cache = False
        dnf_module.list = None
        dnf_module.state = None
        dnf_module._list_items_absent(None)

if __name__ == '__main__':
    unittest.main()