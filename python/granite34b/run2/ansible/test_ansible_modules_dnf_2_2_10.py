import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(
        dnf = DnfModule(module)
        self.assertEqual(dnf.module, module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf.with_modules, False)
        self.assertEqual(dnf.allowerasing, False)
        self.assertEqual(dnf.nobest, False)

    def test_specify_repositories(self):
        module = AnsibleModule(argument_spec=dict())
        dnf = DnfModule(module)
        base = dnf.Base()
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']
        dnf._specify_repositories(base, disablerepo, enablerepo)
        for repo_pattern in disablerepo:
            for repo in base.repos.get_matching(repo_pattern):
                self.assertEqual(repo.enabled, False)
        for repo_pattern in enablerepo:
            for repo in base.repos.get_matching(repo_pattern):
                self.assertEqual(repo.enabled, True)

if __name__ == '__main__':
    unittest.main()