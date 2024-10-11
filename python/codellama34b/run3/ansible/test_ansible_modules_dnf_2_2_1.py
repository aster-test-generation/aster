import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.module)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance.ensure_dnf()

    def test_is_lockfile_pid_valid(self):
        instance = DnfModule(None)
        result = instance.is_lockfile_pid_valid()
        self.assertTrue(result)

    def test_get_best_version(self):
        instance = DnfModule(None)
        result = instance.get_best_version(None, None)
        self.assertIsNone(result)

    def test_get_best_candidate(self):
        instance = DnfModule(None)
        result = instance.get_best_candidate(None, None)
        self.assertIsNone(result)

    def test_get_update_outcome(self):
        instance = DnfModule(None)
        result = instance.get_update_outcome(None)
        self.assertIsNone(result)

    def test_get_install_outcome(self):
        instance = DnfModule(None)
        result = instance.get_install_outcome(None)
        self.assertIsNone(result)

    def test_get_remove_outcome(self):
        instance = DnfModule(None)
        result = instance.get_remove_outcome(None)
        self.assertIsNone(result)

    def test_get_downgrade_outcome(self):
        instance = DnfModule(None)
        result = instance.get_downgrade_outcome(None)
        self.assertIsNone(result)

    def test_get_latest_outcome(self):
        instance = DnfModule(None)
        result = instance.get_latest_outcome(None)
        self.assertIsNone(result)

    def test_get_latest_version(self):
        instance = DnfModule(None)
        result = instance.get_latest_version(None, None)
        self.assertIsNone(result)

    def test_get_latest_candidate(self):
        instance = DnfModule(None)
        result = instance.get_latest_candidate(None, None)
        self.assertIsNone(result)

    def test_get_candidate_version(self):
        instance = DnfModule(None)
        result = instance.get_candidate_version(None, None)
        self.assertIsNone(result)

    def test_get_candidate_name(self):
        instance = DnfModule(None)
        result = instance.get_candidate_name(None, None)
        self.assertIsNone(result)

    def test_get_candidate_source(self):
        instance = DnfModule(None)
        result = instance.get_candidate_source(None, None)
        self.assertIsNone(result)

    def test_get_candidate_reason(self):
        instance = DnfModule(None)
        result = instance.get_candidate_reason(None, None)
        self.assertIsNone(result)

    def test_get_candidate_epoch(self):
        instance = DnfModule(None)
        result = instance.get_candidate_epoch(None, None)
        self.assertIsNone(result)

    def test_get_candidate_release(self):
        instance = DnfModule(None)
        result = instance.get_candidate_release(None, None)
        self.assertIsNone(result)

    def test_get_candidate_arch(self):
        instance = DnfModule(None)
        result = instance.get_candidate_arch(None, None)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()