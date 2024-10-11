import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_dnf_init(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module)

    def test_dnf_base(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        self.assertIsNotNone(base)

    def test_dnf_specify_repositories(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._specify_repositories(base, None, None)

    def test_dnf_configure_base(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._configure_base(base, None, None, None)

    def test_dnf_ensure_dnf(self):
        dnf_module = DnfModule(None)
        dnf_module._ensure_dnf()

    def test_dnf_get_best_version(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_best_version(base, None)

    def test_dnf_get_best_candidate(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_best_candidate(base, None)

    def test_dnf_get_best_candidate_version(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_best_candidate_version(base, None)

    def test_dnf_get_candidate_version(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_candidate_version(base, None)

    def test_dnf_get_package_name(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_package_name(base, None)

    def test_dnf_get_package_version(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_package_version(base, None)

    def test_dnf_get_package_version_for_install(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_package_version_for_install(base, None)

    def test_dnf_get_transaction_cache(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_transaction_cache(base)

    def test_dnf_get_transaction_history(self):
        dnf_module = DnfModule(None)
        base = dnf_module._base(None, None, None, None, None)
        dnf_module._get_transaction_history(base)

if __name__ == '__main__':
    unittest.main()