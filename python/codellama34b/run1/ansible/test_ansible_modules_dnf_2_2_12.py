import unittest
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_list_items(self):
        instance = DnfModule(None)
        instance.list_items(None)

    def test_get_best_query(self):
        instance = DnfModule(None)
        instance.get_best_query(None)

    def test_get_best_query_all(self):
        instance = DnfModule(None)
        instance.get_best_query_all(None)

    def test_get_best_query_filter(self):
        instance = DnfModule(None)
        instance.get_best_query_filter(None)

    def test_get_best_query_latest(self):
        instance = DnfModule(None)
        instance.get_best_query_latest(None)

    def test_get_best_query_latest_all(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_all(None)

    def test_get_best_query_latest_filter(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter(None)

    def test_get_best_query_latest_filter_all(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all(None)

    def test_get_best_query_latest_filter_all_available(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available(None)

    def test_get_best_query_latest_filter_all_available_upgrades(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter_available(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter_available(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter_available_installed(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter_available_installed(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos_updates(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos_updates(None)

    def test_get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos_updates_installed(self):
        instance = DnfModule(None)
        instance.get_best_query_latest_filter_all_available_upgrades_filter_available_installed_repos_updates_installed(None)

if __name__ == '__main__':
    unittest.main()