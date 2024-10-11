import unittest
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_base(self):
        instance = DnfModule(None)
        result = instance._base(None, None, None, None, None)
        self.assertEqual(result, None)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        result = instance._ensure_dnf()
        self.assertEqual(result, None)

    def test_configure_base(self):
        instance = DnfModule(None)
        result = instance._configure_base(None, None, None, None)
        self.assertEqual(result, None)

    def test_specify_repositories(self):
        instance = DnfModule(None)
        result = instance._specify_repositories(None, None, None)
        self.assertEqual(result, None)

    def test_get_best_version(self):
        instance = DnfModule(None)
        result = instance._get_best_version(None, None, None)
        self.assertEqual(result, None)

    def test_get_best_candidate(self):
        instance = DnfModule(None)
        result = instance._get_best_candidate(None, None, None)
        self.assertEqual(result, None)

    def test_get_installed_version(self):
        instance = DnfModule(None)
        result = instance._get_installed_version(None, None)
        self.assertEqual(result, None)

    def test_get_available_version(self):
        instance = DnfModule(None)
        result = instance._get_available_version(None, None)
        self.assertEqual(result, None)

    def test_get_latest_version(self):
        instance = DnfModule(None)
        result = instance._get_latest_version(None, None, None)
        self.assertEqual(result, None)

    def test_get_latest_candidate(self):
        instance = DnfModule(None)
        result = instance._get_latest_candidate(None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_version(self):
        instance = DnfModule(None)
        result = instance._get_candidate_version(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_name(self):
        instance = DnfModule(None)
        result = instance._get_candidate_name(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_nevra(self):
        instance = DnfModule(None)
        result = instance._get_candidate_nevra(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_summary(self):
        instance = DnfModule(None)
        result = instance._get_candidate_summary(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_reponame(self):
        instance = DnfModule(None)
        result = instance._get_candidate_reponame(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_source_name(self):
        instance = DnfModule(None)
        result = instance._get_candidate_source_name(None, None, None, None)
        self.assertEqual(result, None)

    def test_get_candidate_source_nevra(self):
        instance = DnfModule(None)
        result = instance._get_candidate_source_nevra(None, None, None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()