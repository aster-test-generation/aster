import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.module_utils.dnf import YumDnf
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import yumdnf_argument_spec


__metaclass__ = type


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = None
        dnf = DnfModule(module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf.allowerasing, None)
        self.assertEqual(dnf.nobest, None)

    def test_package_dict(self):
        package = None
        dnf = DnfModule(None)
        result = dnf._package_dict(package)
        self.assertEqual(result['name'], package.name)
        self.assertEqual(result['arch'], package.arch)
        self.assertEqual(result['epoch'], str(package.epoch))
        self.assertEqual(result['release'], package.release)
        self.assertEqual(result['version'], package.version)
        self.assertEqual(result['repo'], package.repoid)
        self.assertEqual(result['envra'], '{epoch}:{name}-{version}-{release}.{arch}'.format(**result))
        self.assertEqual(result['nevra'], result['envra'])
        if package.installtime == 0:
            self.assertEqual(result['yumstate'], 'available')
        else:
            self.assertEqual(result['yumstate'], 'installed')

    def test_ensure_dnf(self):
        dnf = DnfModule(None)
        dnf._ensure_dnf()

    def test_get_best_version(self):
        dnf = DnfModule(None)
        result = dnf._get_best_version()

    def test_get_best_candidate(self):
        dnf = DnfModule(None)
        result = dnf._get_best_candidate()

    def test_get_update_candidates(self):
        dnf = DnfModule(None)
        result = dnf._get_update_candidates()

    def test_get_downgrade_candidates(self):
        dnf = DnfModule(None)
        result = dnf._get_downgrade_candidates()

    def test_get_candidate_version(self):
        dnf = DnfModule(None)
        result = dnf._get_candidate_version()

    def test_get_candidate_name(self):
        dnf = DnfModule(None)
        result = dnf._get_candidate_name()

    def test_get_candidate_repo(self):
        dnf = DnfModule(None)
        result = dnf._get_candidate_repo()

    def test_get_installed_version(self):
        dnf = DnfModule(None)
        result = dnf._get_installed_version()

    def test_get_installed_name(self):
        dnf = DnfModule(None)
        result = dnf._get_installed_name()

    def test_get_installed_repo(self):
        dnf = DnfModule(None)
        result = dnf._get_installed_repo()

if __name__ == '__main__':
    unittest.main()