import unittest
from ansible.modules.replace import ReplaceModule


class TestReplaceModule(unittest.TestCase):
    def test_replace_all_instances(self):
        module = ReplaceModule(
            path='/etc/hosts',
            regexp='old\\.host\\.name',
            replace='new.host.name'
        )
        result = module.replace()
        self.assertEqual(result, 'new.host.name')

    def test_replace_after_expression(self):
        module = ReplaceModule(
            path='/etc/apache2/sites-available/default.conf',
            after='NameVirtualHost [*]',
            regexp='^(.+)$',
            replace=' '
        )
        result = module.replace()
        self.assertEqual(result, ' ')

    def test_replace_private_method(self):
        module = ReplaceModule(
            path='/etc/hosts',
            regexp='old\\.host\\.name',
            replace='new.host.name'
        )
        result = module._replace()
        self.assertEqual(result, 'new.host.name')

    def test_replace_protected_method(self):
        module = ReplaceModule(
            path='/etc/hosts',
            regexp='old\\.host\\.name',
            replace='new.host.name'
        )
        result = module._ReplaceModule__replace()
        self.assertEqual(result, 'new.host.name')

    def test_replace_magic_method(self):
        module = ReplaceModule(
            path='/etc/hosts',
            regexp='old\\.host\\.name',
            replace='new.host.name'
        )
        result = module.__str__()
        self.assertEqual(result, 'ReplaceModule')

if __name__ == '__main__':
    unittest.main()