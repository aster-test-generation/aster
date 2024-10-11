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
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_list_items(self):
        instance = DnfModule(None)
        instance.list_items('installed')
        instance.list_items('upgrades')
        instance.list_items('available')
        instance.list_items('repos')
        instance.list_items('repositories')
        instance.list_items('test')

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_package_dict(self):
        instance = DnfModule(None)
        instance._package_dict(None)

    def test_package_dict_with_module(self):
        instance = DnfModule(None)
        instance.with_modules = True
        instance._package_dict(None)

    def test_package_dict_without_module(self):
        instance = DnfModule(None)
        instance.with_modules = False
        instance._package_dict(None)

    def test_get_best_version(self):
        instance = DnfModule(None)
        instance._get_best_version(None, None)

    def test_get_best_version_with_module(self):
        instance = DnfModule(None)
        instance.with_modules = True
        instance._get_best_version(None, None)

    def test_get_best_version_without_module(self):
        instance = DnfModule(None)
        instance.with_modules = False
        instance._get_best_version(None, None)

    def test_get_best_candidate(self):
        instance = DnfModule(None)
        instance._get_best_candidate(None, None)

    def test_get_best_candidate_with_module(self):
        instance = DnfModule(None)
        instance.with_modules = True
        instance._get_best_candidate(None, None)

    def test_get_best_candidate_without_module(self):
        instance = DnfModule(None)
        instance.with_modules = False
        instance._get_best_candidate(None, None)

    def test_get_best_candidate_with_best(self):
        instance = DnfModule(None)
        instance._get_best_candidate(None, None, best=True)

    def test_get_best_candidate_with_best_and_module(self):
        instance = DnfModule(None)
        instance.with_modules = True
        instance._get_best_candidate(None, None, best=True)

    def test_get_best_candidate_with_best_and_without_module(self):
        instance = DnfModule(None)
        instance.with_modules = False
        instance._get_best_candidate(None, None, best=True)

    def test_get_best_candidate_with_best_and_with_exclude(self):
        instance = DnfModule(None)
        instance._get_best_candidate(None, None, best=True, exclude=None)

if __name__ == '__main__':
    unittest.main()