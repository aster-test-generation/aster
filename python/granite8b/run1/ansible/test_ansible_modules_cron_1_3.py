import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.ansible, '')

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.n_existing, '')

    def test__read_user_execute(self):
        cron_tab = CronTab(None)
        result = cron_tab._read_user_execute()
        self.assertEqual(result, 'crontab -u root -l')

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.write_to_file()
        self.assertEqual(cron_tab.n_existing, '')

    def test_write_line_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.write_line_to_file('test')
        self.assertEqual(cron_tab.n_existing, 'test\n')

    def test_remove_cron_lines(self):
        cron_tab = CronTab(None)
        cron_tab.remove_cron_lines()
        self.assertEqual(cron_tab.n_existing, '')

    def test_remove_cron_line(self):
        cron_tab = CronTab(None)
        cron_tab.remove_cron_line('test')
        self.assertEqual(cron_tab.n_existing, '')

    def test_add_cron_line(self):
        cron_tab = CronTab(None)
        cron_tab.add_cron_line('test')
        self.assertEqual(cron_tab.n_existing, 'test\n')

    def test_add_cron_tab(self):
        cron_tab = CronTab(None)
        cron_tab.add_cron_tab('test')
        self.assertEqual(cron_tab.n_existing, 'test\n')

    def test_set_file(self):
        cron_tab = CronTab(None)
        cron_tab.set_file('test')
        self.assertEqual(cron_tab.cron_file, 'test')
        self.assertEqual(cron_tab.b_cron_file, b'test')

    def test_set_user(self):
        cron_tab = CronTab(None)
        cron_tab.set_user('test')
        self.assertEqual(cron_tab.user, 'test')

    def test_set_root(self):
        cron_tab = CronTab(None)
        cron_tab.set_root(True)
        self.assertEqual(cron_tab.root, True)

    def test_set_ansible(self):
        cron_tab = CronTab(None)
        cron_tab.set_ansible('test')
        self.assertEqual(cron_tab.ansible, 'test')

    def test_get_cron_lines(self):
        cron_tab = CronTab(None)
        cron_tab.get_cron_lines()
        self.assertEqual(cron_tab.lines, [])

    def test_get_cron_line(self):
        cron_tab = CronTab(None)
        cron_tab.get_cron_line('test')
        self.assertEqual(cron_tab.lines, [])

    def test_get_cron_tab(self):
        cron_tab = CronTab(None)
        cron_tab.get_cron_tab('test')
        self.assertEqual(cron_tab.lines, [])

    def test_get_cron_file(self):
        cron_tab = CronTab(None)
        cron_tab.get_cron_file('test')
        self.assertEqual(cron_tab.cron_file, 'test')
        self.assertEqual(cron_tab.b_cron_file, b'test')

    def test_get_user(self):
        cron_tab = CronTab(None)
        cron_tab.get_user('test')
        self.assertEqual(cron_tab.user, 'test')

if __name__ == '__main__':
    unittest.main()