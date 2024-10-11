import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_specify_repositories(self):
        base = None
        disablerepo = None
        enablerepo = None
        dnf_module = DnfModule(None)
        dnf_module._specify_repositories(base, disablerepo, enablerepo)

    def test_ensure_dnf(self):
        dnf_module = DnfModule(None)
        dnf_module._ensure_dnf()

    def test_get_best_version(self):
        dnf_module = DnfModule(None)
        dnf_module._get_best_version()

    def test_get_best_candidate(self):
        dnf_module = DnfModule(None)
        dnf_module._get_best_candidate()

    def test_get_candidate_version(self):
        dnf_module = DnfModule(None)
        dnf_module._get_candidate_version()

    def test_get_installed_version(self):
        dnf_module = DnfModule(None)
        dnf_module._get_installed_version()

    def test_get_package_name(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name()

    def test_get_package_url(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_url()

    def test_get_package_filename(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_filename()

    def test_get_package_arch(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_arch()

    def test_get_package_nevra(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_nevra()

    def test_get_package_envra(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_envra()

    def test_get_package_nevr(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_nevr()

    def test_get_package_env(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_env()

    def test_get_package_name_and_arch(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name_and_arch()

    def test_get_package_name_and_version_and_arch(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name_and_version_and_arch()

    def test_get_package_name_and_version(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name_and_version()

    def test_get_package_name_and_release(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name_and_release()

    def test_get_package_name_and_version_and_release(self):
        dnf_module = DnfModule(None)
        dnf_module._get_package_name_and_version_and_release()

if __name__ == '__main__':
    unittest.main()