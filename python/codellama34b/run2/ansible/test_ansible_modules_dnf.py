import unittest
from ansible.module_utils.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_run(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        module_implementation.run()

    def test_get_packages_to_install(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_packages_to_install()
        self.assertEqual(result, [])

    def test_get_packages_to_remove(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_packages_to_remove()
        self.assertEqual(result, [])

    def test_get_packages_to_update(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_packages_to_update()
        self.assertEqual(result, [])

    def test_get_packages_to_latest(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_packages_to_latest()
        self.assertEqual(result, [])

    def test_get_best_candidates(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_best_candidates()
        self.assertEqual(result, [])

    def test_get_downgrade_candidates(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_downgrade_candidates()
        self.assertEqual(result, [])

    def test_get_latest_packages(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_latest_packages()
        self.assertEqual(result, [])

    def test_get_latest_packages_with_no_upgrades(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_latest_packages(no_upgrades=True)
        self.assertEqual(result, [])

    def test_get_latest_packages_with_no_upgrades_and_no_best(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_latest_packages(no_upgrades=True, no_best=True)
        self.assertEqual(result, [])

    def test_get_latest_packages_with_no_upgrades_and_no_best_and_no_deps(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_latest_packages(no_upgrades=True, no_best=True, no_deps=True)
        self.assertEqual(result, [])

    def test_get_latest_packages_with_no_upgrades_and_no_best_and_no_deps_and_exclude(self):
        module = AnsibleModule(**yumdnf_argument_spec)
        module_implementation = DnfModule(module)
        result = module_implementation.get_latest_packages(no_upgrades=True, no_best=True, no_deps=True, exclude=True)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()