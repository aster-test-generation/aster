import unittest
from ansible.modules.yum_repository import YumRepository, AnsibleModule


class TestYumRepository(unittest.TestCase):
    def test_init(self):
        instance = YumRepository(AnsibleModule({}))
        self.assertIsInstance(instance, YumRepository)

    def test__validate_params(self):
        instance = YumRepository(AnsibleModule({}))
        instance._validate_params({'name': 'epel', 'description': 'EPEL YUM repo'})

    def test__create_repo_file(self):
        instance = YumRepository(AnsibleModule({}))
        instance._create_repo_file({'name': 'epel', 'description': 'EPEL YUM repo'})

    def test__update_repo_file(self):
        instance = YumRepository(AnsibleModule({}))
        instance._update_repo_file({'name': 'epel', 'description': 'EPEL YUM repo'})

    def test__delete_repo_file(self):
        instance = YumRepository(AnsibleModule({}))
        instance._delete_repo_file({'name': 'epel'})

    def test_run(self):
        instance = YumRepository(AnsibleModule({'name': 'epel', 'description': 'EPEL YUM repo'}))
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__str__(self):
        instance = YumRepository(AnsibleModule({}))
        self.assertIsInstance(str(instance), str)

    def test__repr__(self):
        instance = YumRepository(AnsibleModule({}))
        self.assertIsInstance(repr(instance), str)

    def test__eq__(self):
        instance1 = YumRepository(AnsibleModule({'name': 'epel'}))
        instance2 = YumRepository(AnsibleModule({'name': 'epel'}))
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()