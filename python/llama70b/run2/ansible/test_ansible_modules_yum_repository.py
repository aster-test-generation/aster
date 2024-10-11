import unittest
from ansible.modules.yum_repository import YumRepo, AnsibleModule


class TestYumRepo(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec={})
        yumrepo = YumRepo(module)
        self.assertIsInstance(yumrepo, YumRepo)

    def test_add(self):
        module = AnsibleModule(argument_spec={'name': 'test', 'state': 'present'})
        yumrepo = YumRepo(module)
        yumrepo.add()
        self.assertTrue(yumrepo.repo_exists)

    def test_remove(self):
        module = AnsibleModule(argument_spec={'name': 'test', 'state': 'absent'})
        yumrepo = YumRepo(module)
        yumrepo.remove()
        self.assertFalse(yumrepo.repo_exists)

    def test_dump(self):
        module = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo = YumRepo(module)
        dump = yumrepo.dump()
        self.assertIsInstance(dump, str)

    def test_save(self):
        module = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo = YumRepo(module)
        yumrepo.save()
        self.assertTrue(os.path.exists(yumrepo.params['dest']))

    def test_private_method__parse_list_param(self):
        module = AnsibleModule(argument_spec={'baseurl': ['http://example.com']})
        yumrepo = YumRepo(module)
        result = yumrepo._YumRepo__parse_list_param('baseurl')
        self.assertEqual(result, 'http://example.com')

    def test_protected_method__get_repo_file(self):
        module = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo = YumRepo(module)
        result = yumrepo._get_repo_file()
        self.assertIsInstance(result, str)

    def test_magic_method__str__(self):
        module = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo = YumRepo(module)
        result = str(yumrepo)
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        module = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo = YumRepo(module)
        result = repr(yumrepo)
        self.assertIsInstance(result, str)

    def test_magic_method__eq__(self):
        module1 = AnsibleModule(argument_spec={'name': 'test'})
        module2 = AnsibleModule(argument_spec={'name': 'test'})
        yumrepo1 = YumRepo(module1)
        yumrepo2 = YumRepo(module2)
        self.assertTrue(yumrepo1 == yumrepo2)

if __name__ == '__main__':
    unittest.main()