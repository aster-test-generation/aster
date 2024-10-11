import unittest
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


__metaclass__ = type


class TestYumDnf(unittest.TestCase):
    def test_yumdnf_init(self):
        result = YumDnf(is_lockfile_pid_valid=lambda: True, run=lambda: True)
        self.assertIsInstance(result, YumDnf)

    def test_yumdnf_get_best_version(self):
        result = YumDnf.get_best_version()
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version(self):
        result = YumDnf().get_best_version(version="1.0")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release(self):
        result = YumDnf.get_best_version(version="1.0", release="1")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch_and_repo(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64", repo="test")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch_and_repo_and_pkg(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64", repo="test", pkg="test")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch_and_repo_and_pkg_and_ver(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64", repo="test", pkg="test", ver="1.0")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch_and_repo_and_pkg_and_ver_and_rel(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64", repo="test", pkg="test", ver="1.0", rel="1")
        self.assertIsInstance(result, str)

    def test_yumdnf_get_best_version_with_version_and_release_and_arch_and_repo_and_pkg_and_ver_and_rel_and_e(self):
        result = YumDnf.get_best_version(version="1.0", release="1", arch="x86_64", repo="test", pkg="test", ver="1.0", rel="1", e="1")
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()